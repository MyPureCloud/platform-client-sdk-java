# ConversationsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteAnalyticsConversationsAggregatesJob**](ConversationsApi#deleteAnalyticsConversationsAggregatesJob) | Delete/cancel an async request for conversation aggregates |
| [**deleteAnalyticsConversationsDetailsJob**](ConversationsApi#deleteAnalyticsConversationsDetailsJob) | Delete/cancel an async details job |
| [**deleteConversation**](ConversationsApi#deleteConversation) | Update a conversation by disconnecting all of the participants |
| [**deleteConversationParticipantCode**](ConversationsApi#deleteConversationParticipantCode) | Delete a code used to add a communication to this participant |
| [**deleteConversationParticipantFlaggedreason**](ConversationsApi#deleteConversationParticipantFlaggedreason) | Remove flagged reason from conversation participant. |
| [**deleteConversationsCallParticipantConsult**](ConversationsApi#deleteConversationsCallParticipantConsult) | Cancel the transfer |
| [**deleteConversationsEmailMessagesDraftAttachment**](ConversationsApi#deleteConversationsEmailMessagesDraftAttachment) | Delete attachment from draft |
| [**deleteConversationsMessagesCachedmediaCachedMediaItemId**](ConversationsApi#deleteConversationsMessagesCachedmediaCachedMediaItemId) | Remove a cached media item asychronously |
| [**deleteConversationsMessagingIntegrationsAppleIntegrationId**](ConversationsApi#deleteConversationsMessagingIntegrationsAppleIntegrationId) | Delete an Apple messaging integration |
| [**deleteConversationsMessagingIntegrationsFacebookIntegrationId**](ConversationsApi#deleteConversationsMessagingIntegrationsFacebookIntegrationId) | Delete a Facebook messaging integration |
| [**deleteConversationsMessagingIntegrationsInstagramIntegrationId**](ConversationsApi#deleteConversationsMessagingIntegrationsInstagramIntegrationId) | Delete Instagram messaging integration |
| [**deleteConversationsMessagingIntegrationsOpenIntegrationId**](ConversationsApi#deleteConversationsMessagingIntegrationsOpenIntegrationId) | Delete an Open messaging integration |
| [**deleteConversationsMessagingIntegrationsTwitterIntegrationId**](ConversationsApi#deleteConversationsMessagingIntegrationsTwitterIntegrationId) | Delete Twitter messaging integration |
| [**deleteConversationsMessagingIntegrationsWhatsappIntegrationId**](ConversationsApi#deleteConversationsMessagingIntegrationsWhatsappIntegrationId) | Delete a WhatsApp messaging integration |
| [**deleteConversationsMessagingSetting**](ConversationsApi#deleteConversationsMessagingSetting) | Delete a messaging setting |
| [**deleteConversationsMessagingSettingsDefault**](ConversationsApi#deleteConversationsMessagingSettingsDefault) | Delete the organization's default setting, a global default will be applied to integrations without settings |
| [**deleteConversationsMessagingSupportedcontentSupportedContentId**](ConversationsApi#deleteConversationsMessagingSupportedcontentSupportedContentId) | Delete a supported content profile |
| [**getAnalyticsConversationDetails**](ConversationsApi#getAnalyticsConversationDetails) | Get a conversation by id |
| [**getAnalyticsConversationsAggregatesJob**](ConversationsApi#getAnalyticsConversationsAggregatesJob) | Get status for async query for conversation aggregates |
| [**getAnalyticsConversationsAggregatesJobResults**](ConversationsApi#getAnalyticsConversationsAggregatesJobResults) | Fetch a page of results for an async aggregates query |
| [**getAnalyticsConversationsDetails**](ConversationsApi#getAnalyticsConversationsDetails) | Gets multiple conversations by id |
| [**getAnalyticsConversationsDetailsJob**](ConversationsApi#getAnalyticsConversationsDetailsJob) | Get status for async query for conversation details |
| [**getAnalyticsConversationsDetailsJobResults**](ConversationsApi#getAnalyticsConversationsDetailsJobResults) | Fetch a page of results for an async details job |
| [**getAnalyticsConversationsDetailsJobsAvailability**](ConversationsApi#getAnalyticsConversationsDetailsJobsAvailability) | Lookup the datalake availability date and time |
| [**getConversation**](ConversationsApi#getConversation) | Get conversation |
| [**getConversationCommunicationInternalmessage**](ConversationsApi#getConversationCommunicationInternalmessage) | Get message |
| [**getConversationCommunicationInternalmessages**](ConversationsApi#getConversationCommunicationInternalmessages) | Get messages for communication |
| [**getConversationParticipantSecureivrsession**](ConversationsApi#getConversationParticipantSecureivrsession) | Fetch info on a secure session |
| [**getConversationParticipantSecureivrsessions**](ConversationsApi#getConversationParticipantSecureivrsessions) | Get a list of secure sessions for this participant. |
| [**getConversationParticipantWrapup**](ConversationsApi#getConversationParticipantWrapup) | Get the wrap-up for this conversation participant.  |
| [**getConversationParticipantWrapupcodes**](ConversationsApi#getConversationParticipantWrapupcodes) | Get list of wrapup codes for this conversation participant |
| [**getConversationSecureattributes**](ConversationsApi#getConversationSecureattributes) | Get the secure attributes on a conversation. |
| [**getConversationSuggestion**](ConversationsApi#getConversationSuggestion) | Get Suggestion. |
| [**getConversationSuggestions**](ConversationsApi#getConversationSuggestions) | Get all suggestions for a conversation. |
| [**getConversationSummaries**](ConversationsApi#getConversationSummaries) | Get the summaries of the conversation. |
| [**getConversations**](ConversationsApi#getConversations) | Get active conversations for the logged in user |
| [**getConversationsCall**](ConversationsApi#getConversationsCall) | Get call conversation |
| [**getConversationsCallParticipantCommunicationWrapup**](ConversationsApi#getConversationsCallParticipantCommunicationWrapup) | Get the wrap-up for this conversation communication.  |
| [**getConversationsCallParticipantWrapup**](ConversationsApi#getConversationsCallParticipantWrapup) | Get the wrap-up for this conversation participant.  |
| [**getConversationsCallParticipantWrapupcodes**](ConversationsApi#getConversationsCallParticipantWrapupcodes) | Get list of wrapup codes for this conversation participant |
| [**getConversationsCallback**](ConversationsApi#getConversationsCallback) | Get callback conversation |
| [**getConversationsCallbackParticipantCommunicationWrapup**](ConversationsApi#getConversationsCallbackParticipantCommunicationWrapup) | Get the wrap-up for this conversation communication.  |
| [**getConversationsCallbackParticipantWrapup**](ConversationsApi#getConversationsCallbackParticipantWrapup) | Get the wrap-up for this conversation participant.  |
| [**getConversationsCallbackParticipantWrapupcodes**](ConversationsApi#getConversationsCallbackParticipantWrapupcodes) | Get list of wrapup codes for this conversation participant |
| [**getConversationsCallbacks**](ConversationsApi#getConversationsCallbacks) | Get active callback conversations for the logged in user |
| [**getConversationsCalls**](ConversationsApi#getConversationsCalls) | Get active call conversations for the logged in user |
| [**getConversationsCallsHistory**](ConversationsApi#getConversationsCallsHistory) | Get call history |
| [**getConversationsCallsMaximumconferenceparties**](ConversationsApi#getConversationsCallsMaximumconferenceparties) | Get the maximum number of participants that this user can have on a conference |
| [**getConversationsChat**](ConversationsApi#getConversationsChat) | Get chat conversation |
| [**getConversationsChatMessage**](ConversationsApi#getConversationsChatMessage) | Get a web chat conversation message |
| [**getConversationsChatMessages**](ConversationsApi#getConversationsChatMessages) | Get the messages of a chat conversation. |
| [**getConversationsChatParticipantCommunicationWrapup**](ConversationsApi#getConversationsChatParticipantCommunicationWrapup) | Get the wrap-up for this conversation communication.  |
| [**getConversationsChatParticipantWrapup**](ConversationsApi#getConversationsChatParticipantWrapup) | Get the wrap-up for this conversation participant.  |
| [**getConversationsChatParticipantWrapupcodes**](ConversationsApi#getConversationsChatParticipantWrapupcodes) | Get list of wrapup codes for this conversation participant |
| [**getConversationsChats**](ConversationsApi#getConversationsChats) | Get active chat conversations for the logged in user |
| [**getConversationsCobrowsesession**](ConversationsApi#getConversationsCobrowsesession) | Get cobrowse conversation |
| [**getConversationsCobrowsesessionParticipantCommunicationWrapup**](ConversationsApi#getConversationsCobrowsesessionParticipantCommunicationWrapup) | Get the wrap-up for this conversation communication.  |
| [**getConversationsCobrowsesessionParticipantWrapup**](ConversationsApi#getConversationsCobrowsesessionParticipantWrapup) | Get the wrap-up for this conversation participant.  |
| [**getConversationsCobrowsesessionParticipantWrapupcodes**](ConversationsApi#getConversationsCobrowsesessionParticipantWrapupcodes) | Get list of wrapup codes for this conversation participant |
| [**getConversationsCobrowsesessions**](ConversationsApi#getConversationsCobrowsesessions) | Get active cobrowse conversations for the logged in user |
| [**getConversationsEmail**](ConversationsApi#getConversationsEmail) | Get email conversation |
| [**getConversationsEmailMessage**](ConversationsApi#getConversationsEmailMessage) | Get conversation message |
| [**getConversationsEmailMessages**](ConversationsApi#getConversationsEmailMessages) | Get conversation messages |
| [**getConversationsEmailMessagesDraft**](ConversationsApi#getConversationsEmailMessagesDraft) | Get conversation draft reply |
| [**getConversationsEmailParticipantCommunicationWrapup**](ConversationsApi#getConversationsEmailParticipantCommunicationWrapup) | Get the wrap-up for this conversation communication.  |
| [**getConversationsEmailParticipantWrapup**](ConversationsApi#getConversationsEmailParticipantWrapup) | Get the wrap-up for this conversation participant.  |
| [**getConversationsEmailParticipantWrapupcodes**](ConversationsApi#getConversationsEmailParticipantWrapupcodes) | Get list of wrapup codes for this conversation participant |
| [**getConversationsEmailSettings**](ConversationsApi#getConversationsEmailSettings) | Get emails settings for a given conversation |
| [**getConversationsEmails**](ConversationsApi#getConversationsEmails) | Get active email conversations for the logged in user |
| [**getConversationsInternalmessage**](ConversationsApi#getConversationsInternalmessage) | Get internal message conversation |
| [**getConversationsInternalmessages**](ConversationsApi#getConversationsInternalmessages) | Get active internal message conversations for the logged in user |
| [**getConversationsKeyconfiguration**](ConversationsApi#getConversationsKeyconfiguration) | Get the encryption key configurations |
| [**getConversationsKeyconfigurations**](ConversationsApi#getConversationsKeyconfigurations) | Get a list of key configurations data |
| [**getConversationsMessage**](ConversationsApi#getConversationsMessage) | Get message conversation |
| [**getConversationsMessageCommunicationMessagesMediaMediaId**](ConversationsApi#getConversationsMessageCommunicationMessagesMediaMediaId) | Get media |
| [**getConversationsMessageDetails**](ConversationsApi#getConversationsMessageDetails) | Get message |
| [**getConversationsMessageMessage**](ConversationsApi#getConversationsMessageMessage) | Get conversation message |
| [**getConversationsMessageParticipantCommunicationWrapup**](ConversationsApi#getConversationsMessageParticipantCommunicationWrapup) | Get the wrap-up for this conversation communication.  |
| [**getConversationsMessageParticipantWrapup**](ConversationsApi#getConversationsMessageParticipantWrapup) | Get the wrap-up for this conversation participant.  |
| [**getConversationsMessageParticipantWrapupcodes**](ConversationsApi#getConversationsMessageParticipantWrapupcodes) | Get list of wrapup codes for this conversation participant |
| [**getConversationsMessages**](ConversationsApi#getConversationsMessages) | Get active message conversations for the logged in user |
| [**getConversationsMessagesCachedmedia**](ConversationsApi#getConversationsMessagesCachedmedia) | Get a list of cached media items |
| [**getConversationsMessagesCachedmediaCachedMediaItemId**](ConversationsApi#getConversationsMessagesCachedmediaCachedMediaItemId) | Get a cached media item |
| [**getConversationsMessagingFacebookApp**](ConversationsApi#getConversationsMessagingFacebookApp) | Get Genesys Facebook App Id |
| [**getConversationsMessagingFacebookPermissions**](ConversationsApi#getConversationsMessagingFacebookPermissions) | Get a list of Facebook Permissions |
| [**getConversationsMessagingIdentityresolutionIntegrationsAppleIntegrationId**](ConversationsApi#getConversationsMessagingIdentityresolutionIntegrationsAppleIntegrationId) | Get Apple messaging integration identity resolution settings |
| [**getConversationsMessagingIdentityresolutionIntegrationsFacebookIntegrationId**](ConversationsApi#getConversationsMessagingIdentityresolutionIntegrationsFacebookIntegrationId) | Get Facebook messaging integration identity resolution settings |
| [**getConversationsMessagingIdentityresolutionIntegrationsInstagramIntegrationId**](ConversationsApi#getConversationsMessagingIdentityresolutionIntegrationsInstagramIntegrationId) | Get an Instagram integration identity resolution settings |
| [**getConversationsMessagingIdentityresolutionIntegrationsOpenIntegrationId**](ConversationsApi#getConversationsMessagingIdentityresolutionIntegrationsOpenIntegrationId) | Get an open messaging integration Identity Resolution settings |
| [**getConversationsMessagingIdentityresolutionIntegrationsTwitterIntegrationId**](ConversationsApi#getConversationsMessagingIdentityresolutionIntegrationsTwitterIntegrationId) | Get X (Formally Twitter) messaging integration identity resolution settings |
| [**getConversationsMessagingIdentityresolutionIntegrationsWhatsappIntegrationId**](ConversationsApi#getConversationsMessagingIdentityresolutionIntegrationsWhatsappIntegrationId) | Get a whatsApp integration Identity Resolution settings |
| [**getConversationsMessagingIntegrationTwitterOauthSettings**](ConversationsApi#getConversationsMessagingIntegrationTwitterOauthSettings) | Get twitter oauth settings to patch an integration |
| [**getConversationsMessagingIntegrations**](ConversationsApi#getConversationsMessagingIntegrations) | Get a list of Integrations |
| [**getConversationsMessagingIntegrationsApple**](ConversationsApi#getConversationsMessagingIntegrationsApple) | Get a list of Apple Integrations |
| [**getConversationsMessagingIntegrationsAppleIntegrationId**](ConversationsApi#getConversationsMessagingIntegrationsAppleIntegrationId) | Get an Apple messaging integration |
| [**getConversationsMessagingIntegrationsFacebook**](ConversationsApi#getConversationsMessagingIntegrationsFacebook) | Get a list of Facebook Integrations |
| [**getConversationsMessagingIntegrationsFacebookIntegrationId**](ConversationsApi#getConversationsMessagingIntegrationsFacebookIntegrationId) | Get a Facebook messaging integration |
| [**getConversationsMessagingIntegrationsInstagram**](ConversationsApi#getConversationsMessagingIntegrationsInstagram) | Get a list of Instagram Integrations |
| [**getConversationsMessagingIntegrationsInstagramIntegrationId**](ConversationsApi#getConversationsMessagingIntegrationsInstagramIntegrationId) | Get Instagram messaging integration |
| [**getConversationsMessagingIntegrationsOpen**](ConversationsApi#getConversationsMessagingIntegrationsOpen) | Get a list of Open messaging integrations |
| [**getConversationsMessagingIntegrationsOpenIntegrationId**](ConversationsApi#getConversationsMessagingIntegrationsOpenIntegrationId) | Get an Open messaging integration |
| [**getConversationsMessagingIntegrationsTwitter**](ConversationsApi#getConversationsMessagingIntegrationsTwitter) | Get a list of Twitter Integrations |
| [**getConversationsMessagingIntegrationsTwitterIntegrationId**](ConversationsApi#getConversationsMessagingIntegrationsTwitterIntegrationId) | Get Twitter messaging integration |
| [**getConversationsMessagingIntegrationsTwitterOauthSettings**](ConversationsApi#getConversationsMessagingIntegrationsTwitterOauthSettings) | Get twitter oauth settings |
| [**getConversationsMessagingIntegrationsWhatsapp**](ConversationsApi#getConversationsMessagingIntegrationsWhatsapp) | Get a list of WhatsApp Integrations |
| [**getConversationsMessagingIntegrationsWhatsappIntegrationId**](ConversationsApi#getConversationsMessagingIntegrationsWhatsappIntegrationId) | Get a WhatsApp messaging integration |
| [**getConversationsMessagingOauthAppleCallback**](ConversationsApi#getConversationsMessagingOauthAppleCallback) | Call Authentication provider callback to validate state and code |
| [**getConversationsMessagingSetting**](ConversationsApi#getConversationsMessagingSetting) | Get a messaging setting |
| [**getConversationsMessagingSettings**](ConversationsApi#getConversationsMessagingSettings) | Get a list of messaging settings |
| [**getConversationsMessagingSettingsDefault**](ConversationsApi#getConversationsMessagingSettingsDefault) | Get the organization's default settings that will be used as the default when creating an integration. |
| [**getConversationsMessagingSupportedcontent**](ConversationsApi#getConversationsMessagingSupportedcontent) | Get a list of Supported Content profiles |
| [**getConversationsMessagingSupportedcontentDefault**](ConversationsApi#getConversationsMessagingSupportedcontentDefault) | Get the organization's default supported content profile that will be used as the default when creating an integration. |
| [**getConversationsMessagingSupportedcontentSupportedContentId**](ConversationsApi#getConversationsMessagingSupportedcontentSupportedContentId) | Get a supported content profile |
| [**getConversationsMessagingThreadingtimeline**](ConversationsApi#getConversationsMessagingThreadingtimeline) | Get conversation threading window timeline for each messaging type |
| [**getConversationsScreenshareParticipantCommunicationWrapup**](ConversationsApi#getConversationsScreenshareParticipantCommunicationWrapup) | Get the wrap-up for this conversation communication.  |
| [**getConversationsSettings**](ConversationsApi#getConversationsSettings) | Get Settings |
| [**getConversationsSocialParticipantCommunicationWrapup**](ConversationsApi#getConversationsSocialParticipantCommunicationWrapup) | Get the wrap-up for this conversation communication.  |
| [**getConversationsVideoDetails**](ConversationsApi#getConversationsVideoDetails) | Get video conference details (e.g. the current number of active participants). |
| [**getConversationsVideoParticipantCommunicationWrapup**](ConversationsApi#getConversationsVideoParticipantCommunicationWrapup) | Get the wrap-up for this conversation communication.  |
| [**getConversationsVideosMeeting**](ConversationsApi#getConversationsVideosMeeting) | Gets a record for a given meetingId |
| [**patchConversationParticipant**](ConversationsApi#patchConversationParticipant) | Update a participant. |
| [**patchConversationParticipantAttributes**](ConversationsApi#patchConversationParticipantAttributes) | Update the attributes on a conversation participant. |
| [**patchConversationRecordingstate**](ConversationsApi#patchConversationRecordingstate) | Update a conversation by setting its recording state |
| [**patchConversationSecureattributes**](ConversationsApi#patchConversationSecureattributes) | Update the secure attributes on a conversation. |
| [**patchConversationSummaryEngagements**](ConversationsApi#patchConversationSummaryEngagements) | Update agent's engagement for the summary. |
| [**patchConversationSummaryFeedback**](ConversationsApi#patchConversationSummaryFeedback) | Update the feedback for the summary. |
| [**patchConversationUtilizationlabel**](ConversationsApi#patchConversationUtilizationlabel) | Update the utilization label on a conversation. When there is no value provided, the system default label is applied |
| [**patchConversationsAftercallworkConversationIdParticipantCommunication**](ConversationsApi#patchConversationsAftercallworkConversationIdParticipantCommunication) | Update after-call work for this conversation communication. |
| [**patchConversationsCall**](ConversationsApi#patchConversationsCall) | Update a conversation by setting its recording state, merging in other conversations to create a conference, or disconnecting all of the participants |
| [**patchConversationsCallConference**](ConversationsApi#patchConversationsCallConference) | Update a conversation by merging in other conversations to create a conference |
| [**patchConversationsCallParticipant**](ConversationsApi#patchConversationsCallParticipant) | Update conversation participant |
| [**patchConversationsCallParticipantAttributes**](ConversationsApi#patchConversationsCallParticipantAttributes) | Update the attributes on a conversation participant. |
| [**patchConversationsCallParticipantCommunication**](ConversationsApi#patchConversationsCallParticipantCommunication) | Update conversation participant's communication by disconnecting it. This endpoint does not update wrapup. |
| [**patchConversationsCallParticipantConsult**](ConversationsApi#patchConversationsCallParticipantConsult) | Change who can speak |
| [**patchConversationsCallback**](ConversationsApi#patchConversationsCallback) | Update a conversation by disconnecting all of the participants |
| [**patchConversationsCallbackParticipant**](ConversationsApi#patchConversationsCallbackParticipant) | Update conversation participant |
| [**patchConversationsCallbackParticipantAttributes**](ConversationsApi#patchConversationsCallbackParticipantAttributes) | Update the attributes on a conversation participant. |
| [**patchConversationsCallbackParticipantCommunication**](ConversationsApi#patchConversationsCallbackParticipantCommunication) | Update conversation participant's communication by disconnecting it. |
| [**patchConversationsCallbacks**](ConversationsApi#patchConversationsCallbacks) | Update a scheduled callback |
| [**patchConversationsChat**](ConversationsApi#patchConversationsChat) | Update a conversation by disconnecting all of the participants |
| [**patchConversationsChatParticipant**](ConversationsApi#patchConversationsChatParticipant) | Update conversation participant |
| [**patchConversationsChatParticipantAttributes**](ConversationsApi#patchConversationsChatParticipantAttributes) | Update the attributes on a conversation participant. |
| [**patchConversationsChatParticipantCommunication**](ConversationsApi#patchConversationsChatParticipantCommunication) | Update conversation participant's communication by disconnecting it. This endpoint does not update wrapup. |
| [**patchConversationsCobrowsesession**](ConversationsApi#patchConversationsCobrowsesession) | Update a conversation by disconnecting all of the participants |
| [**patchConversationsCobrowsesessionParticipant**](ConversationsApi#patchConversationsCobrowsesessionParticipant) | Update conversation participant |
| [**patchConversationsCobrowsesessionParticipantAttributes**](ConversationsApi#patchConversationsCobrowsesessionParticipantAttributes) | Update the attributes on a conversation participant. |
| [**patchConversationsCobrowsesessionParticipantCommunication**](ConversationsApi#patchConversationsCobrowsesessionParticipantCommunication) | Update conversation participant's communication by disconnecting it. |
| [**patchConversationsEmail**](ConversationsApi#patchConversationsEmail) | Update a conversation by disconnecting all of the participants |
| [**patchConversationsEmailMessagesDraft**](ConversationsApi#patchConversationsEmailMessagesDraft) | Reset conversation draft to its initial state and/or auto-fill draft content |
| [**patchConversationsEmailParticipant**](ConversationsApi#patchConversationsEmailParticipant) | Update conversation participant |
| [**patchConversationsEmailParticipantAttributes**](ConversationsApi#patchConversationsEmailParticipantAttributes) | Update the attributes on a conversation participant. |
| [**patchConversationsEmailParticipantCommunication**](ConversationsApi#patchConversationsEmailParticipantCommunication) | Update conversation participant's communication by disconnecting it. This endpoint does not update wrapup. |
| [**patchConversationsEmailParticipantParkingstate**](ConversationsApi#patchConversationsEmailParticipantParkingstate) | Update conversation by setting its parking state |
| [**patchConversationsMessage**](ConversationsApi#patchConversationsMessage) | Update a conversation by disconnecting all of the participants |
| [**patchConversationsMessageParticipant**](ConversationsApi#patchConversationsMessageParticipant) | Update conversation participant |
| [**patchConversationsMessageParticipantAttributes**](ConversationsApi#patchConversationsMessageParticipantAttributes) | Update the attributes on a conversation participant. |
| [**patchConversationsMessageParticipantCommunication**](ConversationsApi#patchConversationsMessageParticipantCommunication) | Update conversation participant's communication by disconnecting it. This endpoint does not update wrapup. |
| [**patchConversationsMessagingIntegrationsAppleIntegrationId**](ConversationsApi#patchConversationsMessagingIntegrationsAppleIntegrationId) | Update an Apple messaging integration |
| [**patchConversationsMessagingIntegrationsFacebookIntegrationId**](ConversationsApi#patchConversationsMessagingIntegrationsFacebookIntegrationId) | Update Facebook messaging integration |
| [**patchConversationsMessagingIntegrationsInstagramIntegrationId**](ConversationsApi#patchConversationsMessagingIntegrationsInstagramIntegrationId) | Update Instagram messaging integration |
| [**patchConversationsMessagingIntegrationsOpenIntegrationId**](ConversationsApi#patchConversationsMessagingIntegrationsOpenIntegrationId) | Update an Open messaging integration |
| [**patchConversationsMessagingIntegrationsTwitterIntegrationId**](ConversationsApi#patchConversationsMessagingIntegrationsTwitterIntegrationId) | Update a Twitter messaging integration |
| [**patchConversationsMessagingIntegrationsWhatsappEmbeddedsignupIntegrationId**](ConversationsApi#patchConversationsMessagingIntegrationsWhatsappEmbeddedsignupIntegrationId) | Activate a WhatsApp messaging integration created using the WhatsApp embedded signup flow |
| [**patchConversationsMessagingIntegrationsWhatsappIntegrationId**](ConversationsApi#patchConversationsMessagingIntegrationsWhatsappIntegrationId) | Update a WhatsApp messaging integration |
| [**patchConversationsMessagingSetting**](ConversationsApi#patchConversationsMessagingSetting) | Update a messaging setting |
| [**patchConversationsMessagingSupportedcontentSupportedContentId**](ConversationsApi#patchConversationsMessagingSupportedcontentSupportedContentId) | Update a supported content profile |
| [**patchConversationsSettings**](ConversationsApi#patchConversationsSettings) | Update Settings |
| [**postAnalyticsConversationDetailsProperties**](ConversationsApi#postAnalyticsConversationDetailsProperties) | Index conversation properties |
| [**postAnalyticsConversationsActivityQuery**](ConversationsApi#postAnalyticsConversationsActivityQuery) | Query for conversation activity observations |
| [**postAnalyticsConversationsAggregatesJobs**](ConversationsApi#postAnalyticsConversationsAggregatesJobs) | Query for conversation aggregates asynchronously |
| [**postAnalyticsConversationsAggregatesQuery**](ConversationsApi#postAnalyticsConversationsAggregatesQuery) | Query for conversation aggregates |
| [**postAnalyticsConversationsDetailsJobs**](ConversationsApi#postAnalyticsConversationsDetailsJobs) | Query for conversation details asynchronously |
| [**postAnalyticsConversationsDetailsQuery**](ConversationsApi#postAnalyticsConversationsDetailsQuery) | Query for conversation details |
| [**postConversationAssign**](ConversationsApi#postConversationAssign) | Attempts to manually assign a specified conversation to a specified user.  Ignores bullseye ring, PAR score, skills, and languages. |
| [**postConversationBarge**](ConversationsApi#postConversationBarge) | Barge a conversation creating a barged in conference of connected participants. |
| [**postConversationCobrowse**](ConversationsApi#postConversationCobrowse) | Creates a cobrowse session. Requires \"conversation:cobrowse:add\" (for web messaging) or \"conversation:cobrowsevoice:add\" permission. |
| [**postConversationCommunicationInternalmessages**](ConversationsApi#postConversationCommunicationInternalmessages) | Send internal message |
| [**postConversationDisconnect**](ConversationsApi#postConversationDisconnect) | Performs a full conversation teardown. Issues disconnect requests for any connected media. Applies a system wrap-up code to any participants that are pending wrap-up. This is not intended to be the normal way of ending interactions but is available in the event of problems with the application to allow a resynchronization of state across all components. It is recommended that users submit a support case if they are relying on this endpoint systematically as there is likely something that needs investigation. |
| [**postConversationParticipantCallbacks**](ConversationsApi#postConversationParticipantCallbacks) | Create a new callback for the specified participant on the conversation. |
| [**postConversationParticipantDigits**](ConversationsApi#postConversationParticipantDigits) | Sends DTMF to the participant |
| [**postConversationParticipantInternalmessagesUsersCommunications**](ConversationsApi#postConversationParticipantInternalmessagesUsersCommunications) | Setup internal message communication with user |
| [**postConversationParticipantReplace**](ConversationsApi#postConversationParticipantReplace) | Replace this participant with the specified user and/or address |
| [**postConversationParticipantReplaceAgent**](ConversationsApi#postConversationParticipantReplaceAgent) | Replace this participant with the specified agent |
| [**postConversationParticipantReplaceContactExternal**](ConversationsApi#postConversationParticipantReplaceContactExternal) | Replace this participant with the an external contact |
| [**postConversationParticipantReplaceExternal**](ConversationsApi#postConversationParticipantReplaceExternal) | Replace this participant with the an external contact |
| [**postConversationParticipantReplaceQueue**](ConversationsApi#postConversationParticipantReplaceQueue) | Replace this participant with the specified queue |
| [**postConversationParticipantSecureivrsessions**](ConversationsApi#postConversationParticipantSecureivrsessions) | Create secure IVR session. Only a participant in the conversation can invoke a secure IVR. |
| [**postConversationParticipantTransfer**](ConversationsApi#postConversationParticipantTransfer) | Replace this participant by another one using the address of the destination. |
| [**postConversationSuggestionEngagement**](ConversationsApi#postConversationSuggestionEngagement) | Save an engagement on the suggestion. |
| [**postConversationSuggestionsFeedback**](ConversationsApi#postConversationSuggestionsFeedback) | Suggestion feedback. |
| [**postConversationSummaryFeedback**](ConversationsApi#postConversationSummaryFeedback) | Submit feedback for the summary. |
| [**postConversationsCall**](ConversationsApi#postConversationsCall) | Place a new call as part of a callback conversation. |
| [**postConversationsCallParticipantBarge**](ConversationsApi#postConversationsCallParticipantBarge) | Barge a given participant's call creating a barged in conference of connected participants. |
| [**postConversationsCallParticipantCoach**](ConversationsApi#postConversationsCallParticipantCoach) | Listen in on the conversation from the point of view of a given participant while speaking to just the given participant. |
| [**postConversationsCallParticipantCommunicationWrapup**](ConversationsApi#postConversationsCallParticipantCommunicationWrapup) | Apply wrap-up for this conversation communication |
| [**postConversationsCallParticipantConsult**](ConversationsApi#postConversationsCallParticipantConsult) | Initiate and update consult transfer |
| [**postConversationsCallParticipantConsultAgent**](ConversationsApi#postConversationsCallParticipantConsultAgent) | Initiate a consult transfer to an agent |
| [**postConversationsCallParticipantConsultContactExternal**](ConversationsApi#postConversationsCallParticipantConsultContactExternal) | Initiate a consult transfer to an external contact |
| [**postConversationsCallParticipantConsultExternal**](ConversationsApi#postConversationsCallParticipantConsultExternal) | Initiate a consult transfer to an external contact |
| [**postConversationsCallParticipantConsultQueue**](ConversationsApi#postConversationsCallParticipantConsultQueue) | Initiate a consult transfer to a queue |
| [**postConversationsCallParticipantMonitor**](ConversationsApi#postConversationsCallParticipantMonitor) | Listen in on the conversation from the point of view of a given participant. |
| [**postConversationsCallParticipantReplace**](ConversationsApi#postConversationsCallParticipantReplace) | Replace this participant with the specified user and/or address |
| [**postConversationsCallParticipantVoiceConsult**](ConversationsApi#postConversationsCallParticipantVoiceConsult) | Initiate voice consult transfer |
| [**postConversationsCallParticipants**](ConversationsApi#postConversationsCallParticipants) | Add participants to a conversation |
| [**postConversationsCallParticipantsUserUserId**](ConversationsApi#postConversationsCallParticipantsUserUserId) | Add participants to a conversation on behalf of a user |
| [**postConversationsCallbackParticipantCommunicationWrapup**](ConversationsApi#postConversationsCallbackParticipantCommunicationWrapup) | Apply wrap-up for this conversation communication |
| [**postConversationsCallbackParticipantReplace**](ConversationsApi#postConversationsCallbackParticipantReplace) | Replace this participant with the specified user and/or address |
| [**postConversationsCallbacks**](ConversationsApi#postConversationsCallbacks) | Create a Callback |
| [**postConversationsCallbacksBulkDisconnect**](ConversationsApi#postConversationsCallbacksBulkDisconnect) | Disconnect multiple scheduled callbacks |
| [**postConversationsCallbacksBulkUpdate**](ConversationsApi#postConversationsCallbacksBulkUpdate) | Update multiple scheduled callbacks |
| [**postConversationsCalls**](ConversationsApi#postConversationsCalls) | Create a call conversation |
| [**postConversationsCallsUserUserId**](ConversationsApi#postConversationsCallsUserUserId) | Create a call conversation on behalf of a user |
| [**postConversationsChatCommunicationMessages**](ConversationsApi#postConversationsChatCommunicationMessages) | Send a message on behalf of a communication in a chat conversation. |
| [**postConversationsChatCommunicationTyping**](ConversationsApi#postConversationsChatCommunicationTyping) | Send a typing-indicator on behalf of a communication in a chat conversation. |
| [**postConversationsChatParticipantCommunicationWrapup**](ConversationsApi#postConversationsChatParticipantCommunicationWrapup) | Apply wrap-up for this conversation communication |
| [**postConversationsChatParticipantReplace**](ConversationsApi#postConversationsChatParticipantReplace) | Replace this participant with the specified user and/or address |
| [**postConversationsChats**](ConversationsApi#postConversationsChats) | Create a web chat conversation |
| [**postConversationsCobrowsesessionParticipantCommunicationWrapup**](ConversationsApi#postConversationsCobrowsesessionParticipantCommunicationWrapup) | Apply wrap-up for this conversation communication |
| [**postConversationsCobrowsesessionParticipantReplace**](ConversationsApi#postConversationsCobrowsesessionParticipantReplace) | Replace this participant with the specified user and/or address |
| [**postConversationsEmailInboundmessages**](ConversationsApi#postConversationsEmailInboundmessages) | Send an email to an external conversation. An external conversation is one where the provider is not PureCloud based. This endpoint allows the sender of the external email to reply or send a new message to the existing conversation. The new message will be treated as part of the existing conversation and chained to it. |
| [**postConversationsEmailMessages**](ConversationsApi#postConversationsEmailMessages) | Send an email reply |
| [**postConversationsEmailMessagesDraftAttachmentsCopy**](ConversationsApi#postConversationsEmailMessagesDraftAttachmentsCopy) | Copy attachments from an email message to the current draft. |
| [**postConversationsEmailParticipantCommunicationWrapup**](ConversationsApi#postConversationsEmailParticipantCommunicationWrapup) | Apply wrap-up for this conversation communication |
| [**postConversationsEmailParticipantReplace**](ConversationsApi#postConversationsEmailParticipantReplace) | Replace this participant with the specified user and/or address |
| [**postConversationsEmailReconnect**](ConversationsApi#postConversationsEmailReconnect) | Reconnect the user to the most recently disconnected customer on a fully disconnected email conversation |
| [**postConversationsEmails**](ConversationsApi#postConversationsEmails) | Create an email conversation |
| [**postConversationsEmailsAgentless**](ConversationsApi#postConversationsEmailsAgentless) | Create an email conversation, per API |
| [**postConversationsFaxes**](ConversationsApi#postConversationsFaxes) | Create Fax Conversation |
| [**postConversationsKeyconfigurations**](ConversationsApi#postConversationsKeyconfigurations) | Setup configurations for encryption key creation |
| [**postConversationsKeyconfigurationsValidate**](ConversationsApi#postConversationsKeyconfigurationsValidate) | Validate encryption key configurations without saving it |
| [**postConversationsMessageCommunicationMessages**](ConversationsApi#postConversationsMessageCommunicationMessages) | Send message |
| [**postConversationsMessageCommunicationMessagesMedia**](ConversationsApi#postConversationsMessageCommunicationMessagesMedia) | Create media |
| [**postConversationsMessageCommunicationMessagesMediaUploads**](ConversationsApi#postConversationsMessageCommunicationMessagesMediaUploads) | Create a URL to upload a message media file |
| [**postConversationsMessageCommunicationSocialmediaMessages**](ConversationsApi#postConversationsMessageCommunicationSocialmediaMessages) | Send a social media message |
| [**postConversationsMessageCommunicationTyping**](ConversationsApi#postConversationsMessageCommunicationTyping) | Send message typing event |
| [**postConversationsMessageInboundOpenEvent**](ConversationsApi#postConversationsMessageInboundOpenEvent) | Send an inbound Open Event Message |
| [**postConversationsMessageInboundOpenMessage**](ConversationsApi#postConversationsMessageInboundOpenMessage) | Send inbound Open Message |
| [**postConversationsMessageInboundOpenReceipt**](ConversationsApi#postConversationsMessageInboundOpenReceipt) | Send an inbound Open Receipt Message |
| [**postConversationsMessageInboundOpenStructuredResponse**](ConversationsApi#postConversationsMessageInboundOpenStructuredResponse) | Send inbound Open Response |
| [**postConversationsMessageMessagesBulk**](ConversationsApi#postConversationsMessageMessagesBulk) | Get messages in batch |
| [**postConversationsMessageParticipantCommunicationWrapup**](ConversationsApi#postConversationsMessageParticipantCommunicationWrapup) | Apply wrap-up for this conversation communication |
| [**postConversationsMessageParticipantMonitor**](ConversationsApi#postConversationsMessageParticipantMonitor) | Listen in on the conversation from the point of view of a given participant. |
| [**postConversationsMessageParticipantReplace**](ConversationsApi#postConversationsMessageParticipantReplace) | Replace this participant with the specified user and/or address |
| [**postConversationsMessages**](ConversationsApi#postConversationsMessages) | Create an outbound messaging conversation. |
| [**postConversationsMessagesAgentless**](ConversationsApi#postConversationsMessagesAgentless) | Send an agentless outbound message |
| [**postConversationsMessagesInboundOpen**](ConversationsApi#postConversationsMessagesInboundOpen) | Send an inbound Open Message |
| [**postConversationsMessagingIntegrationsApple**](ConversationsApi#postConversationsMessagingIntegrationsApple) | Create Apple Integration |
| [**postConversationsMessagingIntegrationsFacebook**](ConversationsApi#postConversationsMessagingIntegrationsFacebook) | Create a Facebook Integration |
| [**postConversationsMessagingIntegrationsInstagram**](ConversationsApi#postConversationsMessagingIntegrationsInstagram) | Create Instagram Integration |
| [**postConversationsMessagingIntegrationsOpen**](ConversationsApi#postConversationsMessagingIntegrationsOpen) | Create an Open messaging integration |
| [**postConversationsMessagingIntegrationsTwitter**](ConversationsApi#postConversationsMessagingIntegrationsTwitter) | Create Twitter Integration |
| [**postConversationsMessagingIntegrationsWhatsapp**](ConversationsApi#postConversationsMessagingIntegrationsWhatsapp) | [This API is deprecated. Use POST /api/v2/conversations/messaging/integrations/whatsapp/embeddedsignup instead] Create a WhatsApp Integration |
| [**postConversationsMessagingIntegrationsWhatsappEmbeddedsignup**](ConversationsApi#postConversationsMessagingIntegrationsWhatsappEmbeddedsignup) | Create a WhatsApp Integration using the WhatsApp embedded signup flow |
| [**postConversationsMessagingSettings**](ConversationsApi#postConversationsMessagingSettings) | Create a messaging setting |
| [**postConversationsMessagingSupportedcontent**](ConversationsApi#postConversationsMessagingSupportedcontent) | Create a Supported Content profile |
| [**postConversationsParticipantsAttributesSearch**](ConversationsApi#postConversationsParticipantsAttributesSearch) | Search conversations |
| [**postConversationsScreenshareParticipantCommunicationWrapup**](ConversationsApi#postConversationsScreenshareParticipantCommunicationWrapup) | Apply wrap-up for this conversation communication |
| [**postConversationsSocialParticipantCommunicationWrapup**](ConversationsApi#postConversationsSocialParticipantCommunicationWrapup) | Apply wrap-up for this conversation communication |
| [**postConversationsVideoAgentconferenceCommunication**](ConversationsApi#postConversationsVideoAgentconferenceCommunication) | Create an Agent-Type video conference and assign an agent to it |
| [**postConversationsVideoParticipantCommunicationWrapup**](ConversationsApi#postConversationsVideoParticipantCommunicationWrapup) | Apply wrap-up for this conversation communication |
| [**postConversationsVideosMeetings**](ConversationsApi#postConversationsVideosMeetings) | Generate a meetingId for a given conferenceId |
| [**putConversationParticipantFlaggedreason**](ConversationsApi#putConversationParticipantFlaggedreason) | Set flagged reason on conversation participant to indicate bad conversation quality. |
| [**putConversationSecureattributes**](ConversationsApi#putConversationSecureattributes) | Set the secure attributes on a conversation. |
| [**putConversationTags**](ConversationsApi#putConversationTags) | Update the tags on a conversation. |
| [**putConversationsCallParticipantCommunicationUuidata**](ConversationsApi#putConversationsCallParticipantCommunicationUuidata) | Set uuiData to be sent on future commands. |
| [**putConversationsCallRecordingstate**](ConversationsApi#putConversationsCallRecordingstate) | Update a conversation by setting its recording state |
| [**putConversationsCallbackRecordingstate**](ConversationsApi#putConversationsCallbackRecordingstate) | Update a conversation by setting its recording state |
| [**putConversationsChatRecordingstate**](ConversationsApi#putConversationsChatRecordingstate) | Update a conversation by setting its recording state |
| [**putConversationsCobrowsesessionRecordingstate**](ConversationsApi#putConversationsCobrowsesessionRecordingstate) | Update a conversation by setting its recording state |
| [**putConversationsEmailMessagesDraft**](ConversationsApi#putConversationsEmailMessagesDraft) | Update conversation draft reply |
| [**putConversationsEmailRecordingstate**](ConversationsApi#putConversationsEmailRecordingstate) | Update a conversation by setting its recording state |
| [**putConversationsKeyconfiguration**](ConversationsApi#putConversationsKeyconfiguration) | Update the encryption key configurations |
| [**putConversationsMessageRecordingstate**](ConversationsApi#putConversationsMessageRecordingstate) | Update a conversation by setting its recording state |
| [**putConversationsMessagingIdentityresolutionIntegrationsAppleIntegrationId**](ConversationsApi#putConversationsMessagingIdentityresolutionIntegrationsAppleIntegrationId) | Create an identity resolution settings for a Apple messaging integration |
| [**putConversationsMessagingIdentityresolutionIntegrationsFacebookIntegrationId**](ConversationsApi#putConversationsMessagingIdentityresolutionIntegrationsFacebookIntegrationId) | Create an identity resolution settings for a Facebook messaging integration |
| [**putConversationsMessagingIdentityresolutionIntegrationsInstagramIntegrationId**](ConversationsApi#putConversationsMessagingIdentityresolutionIntegrationsInstagramIntegrationId) | Create identity resolution settings for an Instagram messaging integration |
| [**putConversationsMessagingIdentityresolutionIntegrationsOpenIntegrationId**](ConversationsApi#putConversationsMessagingIdentityresolutionIntegrationsOpenIntegrationId) | Update an open messaging integration Identity Resolution settings |
| [**putConversationsMessagingIdentityresolutionIntegrationsTwitterIntegrationId**](ConversationsApi#putConversationsMessagingIdentityresolutionIntegrationsTwitterIntegrationId) | Create an identity resolution settings for an X (Formally Twitter) messaging integration |
| [**putConversationsMessagingIdentityresolutionIntegrationsWhatsappIntegrationId**](ConversationsApi#putConversationsMessagingIdentityresolutionIntegrationsWhatsappIntegrationId) | Update a whatsApp integration Identity Resolution settings |
| [**putConversationsMessagingSettingsDefault**](ConversationsApi#putConversationsMessagingSettingsDefault) | Set the organization's default setting that may be applied to to integrations without settings |
| [**putConversationsMessagingSupportedcontentDefault**](ConversationsApi#putConversationsMessagingSupportedcontentDefault) | Set the organization's default supported content profile that may be assigned to an integration when it is created. |
| [**putConversationsMessagingThreadingtimeline**](ConversationsApi#putConversationsMessagingThreadingtimeline) | Update conversation threading window timeline for each messaging type |
| [**putConversationsScreenshareRecordingstate**](ConversationsApi#putConversationsScreenshareRecordingstate) | Update a conversation by setting its recording state |
| [**putConversationsSocialRecordingstate**](ConversationsApi#putConversationsSocialRecordingstate) | Update a conversation by setting its recording state |
| [**putConversationsVideoRecordingstate**](ConversationsApi#putConversationsVideoRecordingstate) | Update a conversation by setting its recording state |
{: class="table-striped"}


# **deleteAnalyticsConversationsAggregatesJob**


> Void deleteAnalyticsConversationsAggregatesJob(jobId)

Delete/cancel an async request for conversation aggregates

deleteAnalyticsConversationsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps DELETE /api/v2/analytics/conversations/aggregates/jobs/{jobId}  

Requires ANY permissions: 

* analytics:conversationAggregate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String jobId = "jobId_example"; // String | jobId
try {
    apiInstance.deleteAnalyticsConversationsAggregatesJob(jobId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#deleteAnalyticsConversationsAggregatesJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| jobId | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteAnalyticsConversationsDetailsJob**


> Void deleteAnalyticsConversationsDetailsJob(jobId)

Delete/cancel an async details job

Wraps DELETE /api/v2/analytics/conversations/details/jobs/{jobId}  

Requires ANY permissions: 

* analytics:conversationDetail:view
* analytics:agentConversationDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String jobId = "jobId_example"; // String | jobId
try {
    apiInstance.deleteAnalyticsConversationsDetailsJob(jobId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#deleteAnalyticsConversationsDetailsJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| jobId | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteConversation**


> Void deleteConversation(conversationId)

Update a conversation by disconnecting all of the participants

Wraps DELETE /api/v2/conversations/{conversationId}  

Requires ANY permissions: 

* conversation:communication:disconnect

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
try {
    apiInstance.deleteConversation(conversationId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#deleteConversation");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteConversationParticipantCode**


> Void deleteConversationParticipantCode(conversationId, participantId, addCommunicationCode)

Delete a code used to add a communication to this participant

Wraps DELETE /api/v2/conversations/{conversationId}/participants/{participantId}/codes/{addCommunicationCode}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
String addCommunicationCode = "addCommunicationCode_example"; // String | addCommunicationCode
try {
    apiInstance.deleteConversationParticipantCode(conversationId, participantId, addCommunicationCode);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#deleteConversationParticipantCode");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | 
| **participantId** | **String**| participant ID | 
| **addCommunicationCode** | **String**| addCommunicationCode | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteConversationParticipantFlaggedreason**


> Void deleteConversationParticipantFlaggedreason(conversationId, participantId)

Remove flagged reason from conversation participant.

Wraps DELETE /api/v2/conversations/{conversationId}/participants/{participantId}/flaggedreason  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
try {
    apiInstance.deleteConversationParticipantFlaggedreason(conversationId, participantId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#deleteConversationParticipantFlaggedreason");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | 
| **participantId** | **String**| participant ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteConversationsCallParticipantConsult**


> Void deleteConversationsCallParticipantConsult(conversationId, participantId)

Cancel the transfer

Wraps DELETE /api/v2/conversations/calls/{conversationId}/participants/{participantId}/consult  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
try {
    apiInstance.deleteConversationsCallParticipantConsult(conversationId, participantId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#deleteConversationsCallParticipantConsult");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteConversationsEmailMessagesDraftAttachment**


> Void deleteConversationsEmailMessagesDraftAttachment(conversationId, attachmentId)

Delete attachment from draft

Wraps DELETE /api/v2/conversations/emails/{conversationId}/messages/draft/attachments/{attachmentId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String attachmentId = "attachmentId_example"; // String | attachmentId
try {
    apiInstance.deleteConversationsEmailMessagesDraftAttachment(conversationId, attachmentId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#deleteConversationsEmailMessagesDraftAttachment");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **attachmentId** | **String**| attachmentId | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteConversationsMessagesCachedmediaCachedMediaItemId**


> Void deleteConversationsMessagesCachedmediaCachedMediaItemId(cachedMediaItemId)

Remove a cached media item asychronously

Wraps DELETE /api/v2/conversations/messages/cachedmedia/{cachedMediaItemId}  

Requires ANY permissions: 

* conversation:cachedMedia:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String cachedMediaItemId = "cachedMediaItemId_example"; // String | cachedMediaItemId
try {
    apiInstance.deleteConversationsMessagesCachedmediaCachedMediaItemId(cachedMediaItemId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#deleteConversationsMessagesCachedmediaCachedMediaItemId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cachedMediaItemId** | **String**| cachedMediaItemId | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteConversationsMessagingIntegrationsAppleIntegrationId**


> Void deleteConversationsMessagingIntegrationsAppleIntegrationId(integrationId)

Delete an Apple messaging integration

Wraps DELETE /api/v2/conversations/messaging/integrations/apple/{integrationId}  

Requires ALL permissions: 

* messaging:integration:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
try {
    apiInstance.deleteConversationsMessagingIntegrationsAppleIntegrationId(integrationId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#deleteConversationsMessagingIntegrationsAppleIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteConversationsMessagingIntegrationsFacebookIntegrationId**


> Void deleteConversationsMessagingIntegrationsFacebookIntegrationId(integrationId)

Delete a Facebook messaging integration

Wraps DELETE /api/v2/conversations/messaging/integrations/facebook/{integrationId}  

Requires ALL permissions: 

* messaging:integration:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
try {
    apiInstance.deleteConversationsMessagingIntegrationsFacebookIntegrationId(integrationId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#deleteConversationsMessagingIntegrationsFacebookIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteConversationsMessagingIntegrationsInstagramIntegrationId**


> Void deleteConversationsMessagingIntegrationsInstagramIntegrationId(integrationId)

Delete Instagram messaging integration

Wraps DELETE /api/v2/conversations/messaging/integrations/instagram/{integrationId}  

Requires ALL permissions: 

* messaging:integration:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
try {
    apiInstance.deleteConversationsMessagingIntegrationsInstagramIntegrationId(integrationId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#deleteConversationsMessagingIntegrationsInstagramIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteConversationsMessagingIntegrationsOpenIntegrationId**


> Void deleteConversationsMessagingIntegrationsOpenIntegrationId(integrationId)

Delete an Open messaging integration

See https://developer.genesys.cloud/api/digital/openmessaging/ for more information.

Wraps DELETE /api/v2/conversations/messaging/integrations/open/{integrationId}  

Requires ALL permissions: 

* messaging:integration:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
try {
    apiInstance.deleteConversationsMessagingIntegrationsOpenIntegrationId(integrationId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#deleteConversationsMessagingIntegrationsOpenIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteConversationsMessagingIntegrationsTwitterIntegrationId**


> Void deleteConversationsMessagingIntegrationsTwitterIntegrationId(integrationId)

Delete Twitter messaging integration

Wraps DELETE /api/v2/conversations/messaging/integrations/twitter/{integrationId}  

Requires ALL permissions: 

* messaging:integration:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
try {
    apiInstance.deleteConversationsMessagingIntegrationsTwitterIntegrationId(integrationId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#deleteConversationsMessagingIntegrationsTwitterIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteConversationsMessagingIntegrationsWhatsappIntegrationId**


> [WhatsAppIntegration](WhatsAppIntegration) deleteConversationsMessagingIntegrationsWhatsappIntegrationId(integrationId)

Delete a WhatsApp messaging integration

Wraps DELETE /api/v2/conversations/messaging/integrations/whatsapp/{integrationId}  

Requires ALL permissions: 

* messaging:integration:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
try {
    WhatsAppIntegration result = apiInstance.deleteConversationsMessagingIntegrationsWhatsappIntegrationId(integrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#deleteConversationsMessagingIntegrationsWhatsappIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
{: class="table-striped"}


### Return type

[**WhatsAppIntegration**](WhatsAppIntegration)


# **deleteConversationsMessagingSetting**


> Void deleteConversationsMessagingSetting(messageSettingId)

Delete a messaging setting

Wraps DELETE /api/v2/conversations/messaging/settings/{messageSettingId}  

Requires ALL permissions: 

* messaging:setting:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String messageSettingId = "messageSettingId_example"; // String | Message Setting ID
try {
    apiInstance.deleteConversationsMessagingSetting(messageSettingId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#deleteConversationsMessagingSetting");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **messageSettingId** | **String**| Message Setting ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteConversationsMessagingSettingsDefault**


> Void deleteConversationsMessagingSettingsDefault()

Delete the organization's default setting, a global default will be applied to integrations without settings

When an integration is created a settings ID may be assigned to it. If the settings ID is not supplied, the default settings will be assigned to it.

Wraps DELETE /api/v2/conversations/messaging/settings/default  

Requires ALL permissions: 

* messaging:setting:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
try {
    apiInstance.deleteConversationsMessagingSettingsDefault();
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#deleteConversationsMessagingSettingsDefault");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

null (empty response body)


# **deleteConversationsMessagingSupportedcontentSupportedContentId**


> Void deleteConversationsMessagingSupportedcontentSupportedContentId(supportedContentId)

Delete a supported content profile

Wraps DELETE /api/v2/conversations/messaging/supportedcontent/{supportedContentId}  

Requires ALL permissions: 

* messaging:supportedContent:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String supportedContentId = "supportedContentId_example"; // String | Supported Content ID
try {
    apiInstance.deleteConversationsMessagingSupportedcontentSupportedContentId(supportedContentId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#deleteConversationsMessagingSupportedcontentSupportedContentId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **supportedContentId** | **String**| Supported Content ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **getAnalyticsConversationDetails**


> [AnalyticsConversationWithoutAttributes](AnalyticsConversationWithoutAttributes) getAnalyticsConversationDetails(conversationId)

Get a conversation by id

Wraps GET /api/v2/analytics/conversations/{conversationId}/details  

Requires ANY permissions: 

* analytics:conversationDetail:view
* analytics:agentConversationDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
try {
    AnalyticsConversationWithoutAttributes result = apiInstance.getAnalyticsConversationDetails(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getAnalyticsConversationDetails");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
{: class="table-striped"}


### Return type

[**AnalyticsConversationWithoutAttributes**](AnalyticsConversationWithoutAttributes)


# **getAnalyticsConversationsAggregatesJob**


> [AsyncQueryStatus](AsyncQueryStatus) getAnalyticsConversationsAggregatesJob(jobId)

Get status for async query for conversation aggregates

getAnalyticsConversationsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/analytics/conversations/aggregates/jobs/{jobId}  

Requires ANY permissions: 

* analytics:conversationAggregate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String jobId = "jobId_example"; // String | jobId
try {
    AsyncQueryStatus result = apiInstance.getAnalyticsConversationsAggregatesJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getAnalyticsConversationsAggregatesJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| jobId | 
{: class="table-striped"}


### Return type

[**AsyncQueryStatus**](AsyncQueryStatus)


# **getAnalyticsConversationsAggregatesJobResults**


> [ConversationAsyncAggregateQueryResponse](ConversationAsyncAggregateQueryResponse) getAnalyticsConversationsAggregatesJobResults(jobId, cursor)

Fetch a page of results for an async aggregates query

getAnalyticsConversationsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/analytics/conversations/aggregates/jobs/{jobId}/results  

Requires ANY permissions: 

* analytics:conversationAggregate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String jobId = "jobId_example"; // String | jobId
String cursor = "cursor_example"; // String | Cursor token to retrieve next page
try {
    ConversationAsyncAggregateQueryResponse result = apiInstance.getAnalyticsConversationsAggregatesJobResults(jobId, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getAnalyticsConversationsAggregatesJobResults");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| jobId | 
| **cursor** | **String**| Cursor token to retrieve next page | [optional] 
{: class="table-striped"}


### Return type

[**ConversationAsyncAggregateQueryResponse**](ConversationAsyncAggregateQueryResponse)


# **getAnalyticsConversationsDetails**


> [AnalyticsConversationWithoutAttributesMultiGetResponse](AnalyticsConversationWithoutAttributesMultiGetResponse) getAnalyticsConversationsDetails(id)

Gets multiple conversations by id

Wraps GET /api/v2/analytics/conversations/details  

Requires ANY permissions: 

* analytics:conversationDetail:view
* analytics:agentConversationDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
List<String> id = Arrays.asList(null); // List<String> | Comma-separated conversation ids
try {
    AnalyticsConversationWithoutAttributesMultiGetResponse result = apiInstance.getAnalyticsConversationsDetails(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getAnalyticsConversationsDetails");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | [**List&lt;String&gt;**](String)| Comma-separated conversation ids | [optional] 
{: class="table-striped"}


### Return type

[**AnalyticsConversationWithoutAttributesMultiGetResponse**](AnalyticsConversationWithoutAttributesMultiGetResponse)


# **getAnalyticsConversationsDetailsJob**


> [AsyncQueryStatus](AsyncQueryStatus) getAnalyticsConversationsDetailsJob(jobId)

Get status for async query for conversation details

Wraps GET /api/v2/analytics/conversations/details/jobs/{jobId}  

Requires ANY permissions: 

* analytics:conversationDetail:view
* analytics:agentConversationDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String jobId = "jobId_example"; // String | jobId
try {
    AsyncQueryStatus result = apiInstance.getAnalyticsConversationsDetailsJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getAnalyticsConversationsDetailsJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| jobId | 
{: class="table-striped"}


### Return type

[**AsyncQueryStatus**](AsyncQueryStatus)


# **getAnalyticsConversationsDetailsJobResults**


> [AnalyticsConversationAsyncQueryResponse](AnalyticsConversationAsyncQueryResponse) getAnalyticsConversationsDetailsJobResults(jobId, cursor, pageSize)

Fetch a page of results for an async details job

Wraps GET /api/v2/analytics/conversations/details/jobs/{jobId}/results  

Requires ANY permissions: 

* analytics:conversationDetail:view
* analytics:agentConversationDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String jobId = "jobId_example"; // String | jobId
String cursor = "cursor_example"; // String | Indicates where to resume query results (not required for first page)
Integer pageSize = 56; // Integer | The desired maximum number of results
try {
    AnalyticsConversationAsyncQueryResponse result = apiInstance.getAnalyticsConversationsDetailsJobResults(jobId, cursor, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getAnalyticsConversationsDetailsJobResults");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| jobId | 
| **cursor** | **String**| Indicates where to resume query results (not required for first page) | [optional] 
| **pageSize** | **Integer**| The desired maximum number of results | [optional] 
{: class="table-striped"}


### Return type

[**AnalyticsConversationAsyncQueryResponse**](AnalyticsConversationAsyncQueryResponse)


# **getAnalyticsConversationsDetailsJobsAvailability**


> [DataAvailabilityResponse](DataAvailabilityResponse) getAnalyticsConversationsDetailsJobsAvailability()

Lookup the datalake availability date and time

Wraps GET /api/v2/analytics/conversations/details/jobs/availability  

Requires ANY permissions: 

* analytics:conversationDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
try {
    DataAvailabilityResponse result = apiInstance.getAnalyticsConversationsDetailsJobsAvailability();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getAnalyticsConversationsDetailsJobsAvailability");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**DataAvailabilityResponse**](DataAvailabilityResponse)


# **getConversation**


> [Conversation](Conversation) getConversation(conversationId)

Get conversation

Wraps GET /api/v2/conversations/{conversationId}  

Requires ANY permissions: 

* conversation:communication:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
try {
    Conversation result = apiInstance.getConversation(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversation");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | 
{: class="table-striped"}


### Return type

[**Conversation**](Conversation)


# **getConversationCommunicationInternalmessage**


> [InternalMessageData](InternalMessageData) getConversationCommunicationInternalmessage(conversationId, communicationId, messageId)

Get message

getConversationCommunicationInternalmessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/conversations/{conversationId}/communications/{communicationId}/internalmessages/{messageId}  

Requires ANY permissions: 

* conversation:internalMessaging:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String communicationId = "communicationId_example"; // String | communicationId
String messageId = "messageId_example"; // String | messageId
try {
    InternalMessageData result = apiInstance.getConversationCommunicationInternalmessage(conversationId, communicationId, messageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationCommunicationInternalmessage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **communicationId** | **String**| communicationId | 
| **messageId** | **String**| messageId | 
{: class="table-striped"}


### Return type

[**InternalMessageData**](InternalMessageData)


# **getConversationCommunicationInternalmessages**


> [InternalMessageDataEntityListing](InternalMessageDataEntityListing) getConversationCommunicationInternalmessages(conversationId, communicationId, pageSize, pageNumber)

Get messages for communication

getConversationCommunicationInternalmessages is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/conversations/{conversationId}/communications/{communicationId}/internalmessages  

Requires ANY permissions: 

* conversation:internalMessaging:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String communicationId = "communicationId_example"; // String | communicationId
Integer pageSize = 25; // Integer | Indicates maximum number of results in response. Default page size is 25 results. The maximum page size is 200.
Integer pageNumber = 1; // Integer | Page number
try {
    InternalMessageDataEntityListing result = apiInstance.getConversationCommunicationInternalmessages(conversationId, communicationId, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationCommunicationInternalmessages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **communicationId** | **String**| communicationId | 
| **pageSize** | **Integer**| Indicates maximum number of results in response. Default page size is 25 results. The maximum page size is 200. | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**InternalMessageDataEntityListing**](InternalMessageDataEntityListing)


# **getConversationParticipantSecureivrsession**


> [SecureSession](SecureSession) getConversationParticipantSecureivrsession(conversationId, participantId, secureSessionId)

Fetch info on a secure session

Wraps GET /api/v2/conversations/{conversationId}/participants/{participantId}/secureivrsessions/{secureSessionId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
String secureSessionId = "secureSessionId_example"; // String | secure IVR session ID
try {
    SecureSession result = apiInstance.getConversationParticipantSecureivrsession(conversationId, participantId, secureSessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationParticipantSecureivrsession");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | 
| **participantId** | **String**| participant ID | 
| **secureSessionId** | **String**| secure IVR session ID | 
{: class="table-striped"}


### Return type

[**SecureSession**](SecureSession)


# **getConversationParticipantSecureivrsessions**


> [SecureSessionEntityListing](SecureSessionEntityListing) getConversationParticipantSecureivrsessions(conversationId, participantId)

Get a list of secure sessions for this participant.

Wraps GET /api/v2/conversations/{conversationId}/participants/{participantId}/secureivrsessions  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
try {
    SecureSessionEntityListing result = apiInstance.getConversationParticipantSecureivrsessions(conversationId, participantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationParticipantSecureivrsessions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | 
| **participantId** | **String**| participant ID | 
{: class="table-striped"}


### Return type

[**SecureSessionEntityListing**](SecureSessionEntityListing)


# **getConversationParticipantWrapup**


> [AssignedWrapupCode](AssignedWrapupCode) getConversationParticipantWrapup(conversationId, participantId, provisional)

Get the wrap-up for this conversation participant. 

Wraps GET /api/v2/conversations/{conversationId}/participants/{participantId}/wrapup  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
Boolean provisional = false; // Boolean | Indicates if the wrap-up code is provisional.
try {
    AssignedWrapupCode result = apiInstance.getConversationParticipantWrapup(conversationId, participantId, provisional);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationParticipantWrapup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | 
| **participantId** | **String**| participant ID | 
| **provisional** | **Boolean**| Indicates if the wrap-up code is provisional. | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**AssignedWrapupCode**](AssignedWrapupCode)


# **getConversationParticipantWrapupcodes**


> [List&lt;WrapupCode&gt;](WrapupCode) getConversationParticipantWrapupcodes(conversationId, participantId)

Get list of wrapup codes for this conversation participant

Wraps GET /api/v2/conversations/{conversationId}/participants/{participantId}/wrapupcodes  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
try {
    List<WrapupCode> result = apiInstance.getConversationParticipantWrapupcodes(conversationId, participantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationParticipantWrapupcodes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | 
| **participantId** | **String**| participant ID | 
{: class="table-striped"}


### Return type

[**List&lt;WrapupCode&gt;**](WrapupCode)


# **getConversationSecureattributes**


> [ConversationSecureAttributes](ConversationSecureAttributes) getConversationSecureattributes(conversationId)

Get the secure attributes on a conversation.

Wraps GET /api/v2/conversations/{conversationId}/secureattributes  

Requires ANY permissions: 

* conversation:participant:attributesview

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
try {
    ConversationSecureAttributes result = apiInstance.getConversationSecureattributes(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationSecureattributes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | 
{: class="table-striped"}


### Return type

[**ConversationSecureAttributes**](ConversationSecureAttributes)


# **getConversationSuggestion**


> [Suggestion](Suggestion) getConversationSuggestion(conversationId, suggestionId)

Get Suggestion.

Wraps GET /api/v2/conversations/{conversationId}/suggestions/{suggestionId}  

Requires ALL permissions: 

* conversation:suggestion:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String suggestionId = "suggestionId_example"; // String | Suggestion ID
try {
    Suggestion result = apiInstance.getConversationSuggestion(conversationId, suggestionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationSuggestion");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| Conversation ID | 
| **suggestionId** | **String**| Suggestion ID | 
{: class="table-striped"}


### Return type

[**Suggestion**](Suggestion)


# **getConversationSuggestions**


> [SuggestionListing](SuggestionListing) getConversationSuggestions(conversationId, before, after, pageSize, type, state)

Get all suggestions for a conversation.

Wraps GET /api/v2/conversations/{conversationId}/suggestions  

Requires ALL permissions: 

* conversation:suggestion:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String before = "before_example"; // String | The cursor that points to the start of the set of entities that has been returned.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
String type = "type_example"; // String | Suggestion type to filter by.
String state = "state_example"; // String | Suggestion state to filter Copilot suggestions.
try {
    SuggestionListing result = apiInstance.getConversationSuggestions(conversationId, before, after, pageSize, type, state);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationSuggestions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| Conversation ID | 
| **before** | **String**| The cursor that points to the start of the set of entities that has been returned. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
| **type** | **String**| Suggestion type to filter by. | [optional]<br />**Values**: Faq, Article, KnowledgeArticle, KnowledgeSearch, CannedResponse, Script 
| **state** | **String**| Suggestion state to filter Copilot suggestions. | [optional]<br />**Values**: Suggested, Accepted, Dismissed, Failed, Rated 
{: class="table-striped"}


### Return type

[**SuggestionListing**](SuggestionListing)


# **getConversationSummaries**


> [ConversationSummariesGetResponse](ConversationSummariesGetResponse) getConversationSummaries(conversationId)

Get the summaries of the conversation.

Wraps GET /api/v2/conversations/{conversationId}/summaries  

Requires ALL permissions: 

* conversation:summary:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | Conversation ID
try {
    ConversationSummariesGetResponse result = apiInstance.getConversationSummaries(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationSummaries");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| Conversation ID | 
{: class="table-striped"}


### Return type

[**ConversationSummariesGetResponse**](ConversationSummariesGetResponse)


# **getConversations**


> [ConversationEntityListing](ConversationEntityListing) getConversations(communicationType)

Get active conversations for the logged in user

Wraps GET /api/v2/conversations  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String communicationType = "communicationType_example"; // String | Call or Chat communication filtering
try {
    ConversationEntityListing result = apiInstance.getConversations(communicationType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **communicationType** | **String**| Call or Chat communication filtering | [optional] 
{: class="table-striped"}


### Return type

[**ConversationEntityListing**](ConversationEntityListing)


# **getConversationsCall**


> [CallConversation](CallConversation) getConversationsCall(conversationId)

Get call conversation

Wraps GET /api/v2/conversations/calls/{conversationId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
try {
    CallConversation result = apiInstance.getConversationsCall(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCall");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
{: class="table-striped"}


### Return type

[**CallConversation**](CallConversation)


# **getConversationsCallParticipantCommunicationWrapup**


> [AssignedWrapupCode](AssignedWrapupCode) getConversationsCallParticipantCommunicationWrapup(conversationId, participantId, communicationId, provisional)

Get the wrap-up for this conversation communication. 

Wraps GET /api/v2/conversations/calls/{conversationId}/participants/{participantId}/communications/{communicationId}/wrapup  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
Boolean provisional = false; // Boolean | Indicates whether or not to fetch provisional wrap-up code.
try {
    AssignedWrapupCode result = apiInstance.getConversationsCallParticipantCommunicationWrapup(conversationId, participantId, communicationId, provisional);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCallParticipantCommunicationWrapup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **communicationId** | **String**| communicationId | 
| **provisional** | **Boolean**| Indicates whether or not to fetch provisional wrap-up code. | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**AssignedWrapupCode**](AssignedWrapupCode)


# **getConversationsCallParticipantWrapup**


> [AssignedWrapupCode](AssignedWrapupCode) getConversationsCallParticipantWrapup(conversationId, participantId, provisional)

Get the wrap-up for this conversation participant. 

Wraps GET /api/v2/conversations/calls/{conversationId}/participants/{participantId}/wrapup  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
Boolean provisional = false; // Boolean | Indicates whether or not to fetch provisional wrap-up code.
try {
    AssignedWrapupCode result = apiInstance.getConversationsCallParticipantWrapup(conversationId, participantId, provisional);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCallParticipantWrapup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **provisional** | **Boolean**| Indicates whether or not to fetch provisional wrap-up code. | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**AssignedWrapupCode**](AssignedWrapupCode)


# **getConversationsCallParticipantWrapupcodes**


> [List&lt;WrapupCode&gt;](WrapupCode) getConversationsCallParticipantWrapupcodes(conversationId, participantId)

Get list of wrapup codes for this conversation participant

Wraps GET /api/v2/conversations/calls/{conversationId}/participants/{participantId}/wrapupcodes  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
try {
    List<WrapupCode> result = apiInstance.getConversationsCallParticipantWrapupcodes(conversationId, participantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCallParticipantWrapupcodes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
{: class="table-striped"}


### Return type

[**List&lt;WrapupCode&gt;**](WrapupCode)


# **getConversationsCallback**


> [CallbackConversation](CallbackConversation) getConversationsCallback(conversationId)

Get callback conversation

Wraps GET /api/v2/conversations/callbacks/{conversationId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
try {
    CallbackConversation result = apiInstance.getConversationsCallback(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCallback");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
{: class="table-striped"}


### Return type

[**CallbackConversation**](CallbackConversation)


# **getConversationsCallbackParticipantCommunicationWrapup**


> [AssignedWrapupCode](AssignedWrapupCode) getConversationsCallbackParticipantCommunicationWrapup(conversationId, participantId, communicationId, provisional)

Get the wrap-up for this conversation communication. 

Wraps GET /api/v2/conversations/callbacks/{conversationId}/participants/{participantId}/communications/{communicationId}/wrapup  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
Boolean provisional = false; // Boolean | Indicates whether or not to fetch provisional wrap-up code.
try {
    AssignedWrapupCode result = apiInstance.getConversationsCallbackParticipantCommunicationWrapup(conversationId, participantId, communicationId, provisional);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCallbackParticipantCommunicationWrapup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **communicationId** | **String**| communicationId | 
| **provisional** | **Boolean**| Indicates whether or not to fetch provisional wrap-up code. | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**AssignedWrapupCode**](AssignedWrapupCode)


# **getConversationsCallbackParticipantWrapup**


> [AssignedWrapupCode](AssignedWrapupCode) getConversationsCallbackParticipantWrapup(conversationId, participantId, provisional)

Get the wrap-up for this conversation participant. 

Wraps GET /api/v2/conversations/callbacks/{conversationId}/participants/{participantId}/wrapup  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
Boolean provisional = false; // Boolean | Indicates whether or not to fetch provisional wrap-up code.
try {
    AssignedWrapupCode result = apiInstance.getConversationsCallbackParticipantWrapup(conversationId, participantId, provisional);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCallbackParticipantWrapup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **provisional** | **Boolean**| Indicates whether or not to fetch provisional wrap-up code. | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**AssignedWrapupCode**](AssignedWrapupCode)


# **getConversationsCallbackParticipantWrapupcodes**


> [List&lt;WrapupCode&gt;](WrapupCode) getConversationsCallbackParticipantWrapupcodes(conversationId, participantId)

Get list of wrapup codes for this conversation participant

Wraps GET /api/v2/conversations/callbacks/{conversationId}/participants/{participantId}/wrapupcodes  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
try {
    List<WrapupCode> result = apiInstance.getConversationsCallbackParticipantWrapupcodes(conversationId, participantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCallbackParticipantWrapupcodes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
{: class="table-striped"}


### Return type

[**List&lt;WrapupCode&gt;**](WrapupCode)


# **getConversationsCallbacks**


> [CallbackConversationEntityListing](CallbackConversationEntityListing) getConversationsCallbacks()

Get active callback conversations for the logged in user

Wraps GET /api/v2/conversations/callbacks  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
try {
    CallbackConversationEntityListing result = apiInstance.getConversationsCallbacks();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCallbacks");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**CallbackConversationEntityListing**](CallbackConversationEntityListing)


# **getConversationsCalls**


> [CallConversationEntityListing](CallConversationEntityListing) getConversationsCalls()

Get active call conversations for the logged in user

Wraps GET /api/v2/conversations/calls  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
try {
    CallConversationEntityListing result = apiInstance.getConversationsCalls();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCalls");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**CallConversationEntityListing**](CallConversationEntityListing)


# **getConversationsCallsHistory**


> [CallHistoryConversationEntityListing](CallHistoryConversationEntityListing) getConversationsCallsHistory(pageSize, pageNumber, interval, expand)

Get call history

Wraps GET /api/v2/conversations/calls/history  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
Integer pageSize = 25; // Integer | Page size, maximum 50
Integer pageNumber = 1; // Integer | Page number
String interval = "interval_example"; // String | Interval string; format is ISO-8601. Separate start and end times with forward slash '/'
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand.
try {
    CallHistoryConversationEntityListing result = apiInstance.getConversationsCallsHistory(pageSize, pageNumber, interval, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCallsHistory");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size, maximum 50 | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **interval** | **String**| Interval string; format is ISO-8601. Separate start and end times with forward slash &#39;/&#39; | [optional] 
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand. | [optional]<br />**Values**: externalorganization, externalcontact, user, queue, group 
{: class="table-striped"}


### Return type

[**CallHistoryConversationEntityListing**](CallHistoryConversationEntityListing)


# **getConversationsCallsMaximumconferenceparties**


> [MaxParticipants](MaxParticipants) getConversationsCallsMaximumconferenceparties()

Get the maximum number of participants that this user can have on a conference

Wraps GET /api/v2/conversations/calls/maximumconferenceparties  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
try {
    MaxParticipants result = apiInstance.getConversationsCallsMaximumconferenceparties();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCallsMaximumconferenceparties");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**MaxParticipants**](MaxParticipants)


# **getConversationsChat**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [ChatConversation](ChatConversation) getConversationsChat(conversationId)

Get chat conversation

This endpoint is deprecated. Please see the article https://help.genesys.cloud/articles/deprecation-removal-of-acd-web-chat-version-2/.

Wraps GET /api/v2/conversations/chats/{conversationId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
try {
    ChatConversation result = apiInstance.getConversationsChat(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsChat");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
{: class="table-striped"}


### Return type

[**ChatConversation**](ChatConversation)


# **getConversationsChatMessage**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [WebChatMessage](WebChatMessage) getConversationsChatMessage(conversationId, messageId)

Get a web chat conversation message

This endpoint is deprecated. Please see the article https://help.genesys.cloud/articles/deprecation-removal-of-acd-web-chat-version-2/. The current user must be involved with the conversation to get its messages.

Wraps GET /api/v2/conversations/chats/{conversationId}/messages/{messageId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String messageId = "messageId_example"; // String | messageId
try {
    WebChatMessage result = apiInstance.getConversationsChatMessage(conversationId, messageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsChatMessage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **messageId** | **String**| messageId | 
{: class="table-striped"}


### Return type

[**WebChatMessage**](WebChatMessage)


# **getConversationsChatMessages**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [WebChatMessageEntityList](WebChatMessageEntityList) getConversationsChatMessages(conversationId, after, before, sortOrder, maxResults)

Get the messages of a chat conversation.

This endpoint is deprecated. Please see the article https://help.genesys.cloud/articles/deprecation-removal-of-acd-web-chat-version-2/. The current user must be involved with the conversation to get its messages.

Wraps GET /api/v2/conversations/chats/{conversationId}/messages  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String after = "after_example"; // String | If specified, get the messages chronologically after the id of this message
String before = "before_example"; // String | If specified, get the messages chronologically before the id of this message
String sortOrder = "ascending"; // String | Sort order
Integer maxResults = 100; // Integer | Limit the returned number of messages, up to a maximum of 100
try {
    WebChatMessageEntityList result = apiInstance.getConversationsChatMessages(conversationId, after, before, sortOrder, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsChatMessages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **after** | **String**| If specified, get the messages chronologically after the id of this message | [optional] 
| **before** | **String**| If specified, get the messages chronologically before the id of this message | [optional] 
| **sortOrder** | **String**| Sort order | [optional] [default to ascending]<br />**Values**: ascending, descending 
| **maxResults** | **Integer**| Limit the returned number of messages, up to a maximum of 100 | [optional] [default to 100] 
{: class="table-striped"}


### Return type

[**WebChatMessageEntityList**](WebChatMessageEntityList)


# **getConversationsChatParticipantCommunicationWrapup**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [AssignedWrapupCode](AssignedWrapupCode) getConversationsChatParticipantCommunicationWrapup(conversationId, participantId, communicationId, provisional)

Get the wrap-up for this conversation communication. 

This endpoint is deprecated. Please see the article https://help.genesys.cloud/articles/deprecation-removal-of-acd-web-chat-version-2/.

Wraps GET /api/v2/conversations/chats/{conversationId}/participants/{participantId}/communications/{communicationId}/wrapup  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
Boolean provisional = false; // Boolean | Indicates whether or not to fetch provisional wrap-up code.
try {
    AssignedWrapupCode result = apiInstance.getConversationsChatParticipantCommunicationWrapup(conversationId, participantId, communicationId, provisional);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsChatParticipantCommunicationWrapup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **communicationId** | **String**| communicationId | 
| **provisional** | **Boolean**| Indicates whether or not to fetch provisional wrap-up code. | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**AssignedWrapupCode**](AssignedWrapupCode)


# **getConversationsChatParticipantWrapup**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [AssignedWrapupCode](AssignedWrapupCode) getConversationsChatParticipantWrapup(conversationId, participantId, provisional)

Get the wrap-up for this conversation participant. 

This endpoint is deprecated. Please see the article https://help.genesys.cloud/articles/deprecation-removal-of-acd-web-chat-version-2/.

Wraps GET /api/v2/conversations/chats/{conversationId}/participants/{participantId}/wrapup  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
Boolean provisional = false; // Boolean | Indicates whether or not to fetch provisional wrap-up code.
try {
    AssignedWrapupCode result = apiInstance.getConversationsChatParticipantWrapup(conversationId, participantId, provisional);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsChatParticipantWrapup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **provisional** | **Boolean**| Indicates whether or not to fetch provisional wrap-up code. | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**AssignedWrapupCode**](AssignedWrapupCode)


# **getConversationsChatParticipantWrapupcodes**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [List&lt;WrapupCode&gt;](WrapupCode) getConversationsChatParticipantWrapupcodes(conversationId, participantId)

Get list of wrapup codes for this conversation participant

This endpoint is deprecated. Please see the article https://help.genesys.cloud/articles/deprecation-removal-of-acd-web-chat-version-2/.

Wraps GET /api/v2/conversations/chats/{conversationId}/participants/{participantId}/wrapupcodes  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
try {
    List<WrapupCode> result = apiInstance.getConversationsChatParticipantWrapupcodes(conversationId, participantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsChatParticipantWrapupcodes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
{: class="table-striped"}


### Return type

[**List&lt;WrapupCode&gt;**](WrapupCode)


# **getConversationsChats**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [ChatConversationEntityListing](ChatConversationEntityListing) getConversationsChats()

Get active chat conversations for the logged in user

This endpoint is deprecated. Please see the article https://help.genesys.cloud/articles/deprecation-removal-of-acd-web-chat-version-2/.

Wraps GET /api/v2/conversations/chats  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
try {
    ChatConversationEntityListing result = apiInstance.getConversationsChats();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsChats");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**ChatConversationEntityListing**](ChatConversationEntityListing)


# **getConversationsCobrowsesession**


> [CobrowseConversation](CobrowseConversation) getConversationsCobrowsesession(conversationId)

Get cobrowse conversation

Wraps GET /api/v2/conversations/cobrowsesessions/{conversationId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
try {
    CobrowseConversation result = apiInstance.getConversationsCobrowsesession(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCobrowsesession");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
{: class="table-striped"}


### Return type

[**CobrowseConversation**](CobrowseConversation)


# **getConversationsCobrowsesessionParticipantCommunicationWrapup**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [AssignedWrapupCode](AssignedWrapupCode) getConversationsCobrowsesessionParticipantCommunicationWrapup(conversationId, participantId, communicationId, provisional)

Get the wrap-up for this conversation communication. 

This endpoint is deprecated. Please see the article https://help.genesys.cloud/articles/deprecation-legacy-co-browse-and-screenshare/

Wraps GET /api/v2/conversations/cobrowsesessions/{conversationId}/participants/{participantId}/communications/{communicationId}/wrapup  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
Boolean provisional = false; // Boolean | Indicates whether or not to fetch provisional wrap-up code.
try {
    AssignedWrapupCode result = apiInstance.getConversationsCobrowsesessionParticipantCommunicationWrapup(conversationId, participantId, communicationId, provisional);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCobrowsesessionParticipantCommunicationWrapup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **communicationId** | **String**| communicationId | 
| **provisional** | **Boolean**| Indicates whether or not to fetch provisional wrap-up code. | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**AssignedWrapupCode**](AssignedWrapupCode)


# **getConversationsCobrowsesessionParticipantWrapup**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [AssignedWrapupCode](AssignedWrapupCode) getConversationsCobrowsesessionParticipantWrapup(conversationId, participantId, provisional)

Get the wrap-up for this conversation participant. 

This endpoint is deprecated. Please see the article https://help.genesys.cloud/articles/deprecation-legacy-co-browse-and-screenshare/

Wraps GET /api/v2/conversations/cobrowsesessions/{conversationId}/participants/{participantId}/wrapup  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
Boolean provisional = false; // Boolean | Indicates whether or not to fetch provisional wrap-up code.
try {
    AssignedWrapupCode result = apiInstance.getConversationsCobrowsesessionParticipantWrapup(conversationId, participantId, provisional);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCobrowsesessionParticipantWrapup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **provisional** | **Boolean**| Indicates whether or not to fetch provisional wrap-up code. | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**AssignedWrapupCode**](AssignedWrapupCode)


# **getConversationsCobrowsesessionParticipantWrapupcodes**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [List&lt;WrapupCode&gt;](WrapupCode) getConversationsCobrowsesessionParticipantWrapupcodes(conversationId, participantId)

Get list of wrapup codes for this conversation participant

This endpoint is deprecated. Please see the article https://help.genesys.cloud/articles/deprecation-legacy-co-browse-and-screenshare/

Wraps GET /api/v2/conversations/cobrowsesessions/{conversationId}/participants/{participantId}/wrapupcodes  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
try {
    List<WrapupCode> result = apiInstance.getConversationsCobrowsesessionParticipantWrapupcodes(conversationId, participantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCobrowsesessionParticipantWrapupcodes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
{: class="table-striped"}


### Return type

[**List&lt;WrapupCode&gt;**](WrapupCode)


# **getConversationsCobrowsesessions**


> [CobrowseConversationEntityListing](CobrowseConversationEntityListing) getConversationsCobrowsesessions()

Get active cobrowse conversations for the logged in user

Wraps GET /api/v2/conversations/cobrowsesessions  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
try {
    CobrowseConversationEntityListing result = apiInstance.getConversationsCobrowsesessions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCobrowsesessions");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**CobrowseConversationEntityListing**](CobrowseConversationEntityListing)


# **getConversationsEmail**


> [EmailConversation](EmailConversation) getConversationsEmail(conversationId)

Get email conversation

Wraps GET /api/v2/conversations/emails/{conversationId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
try {
    EmailConversation result = apiInstance.getConversationsEmail(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsEmail");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
{: class="table-striped"}


### Return type

[**EmailConversation**](EmailConversation)


# **getConversationsEmailMessage**


> [EmailMessage](EmailMessage) getConversationsEmailMessage(conversationId, messageId)

Get conversation message

Wraps GET /api/v2/conversations/emails/{conversationId}/messages/{messageId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String messageId = "messageId_example"; // String | messageId
try {
    EmailMessage result = apiInstance.getConversationsEmailMessage(conversationId, messageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsEmailMessage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **messageId** | **String**| messageId | 
{: class="table-striped"}


### Return type

[**EmailMessage**](EmailMessage)


# **getConversationsEmailMessages**


> [EmailMessagePreviewListing](EmailMessagePreviewListing) getConversationsEmailMessages(conversationId)

Get conversation messages

Wraps GET /api/v2/conversations/emails/{conversationId}/messages  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
try {
    EmailMessagePreviewListing result = apiInstance.getConversationsEmailMessages(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsEmailMessages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
{: class="table-striped"}


### Return type

[**EmailMessagePreviewListing**](EmailMessagePreviewListing)


# **getConversationsEmailMessagesDraft**


> [EmailMessage](EmailMessage) getConversationsEmailMessagesDraft(conversationId)

Get conversation draft reply

Wraps GET /api/v2/conversations/emails/{conversationId}/messages/draft  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
try {
    EmailMessage result = apiInstance.getConversationsEmailMessagesDraft(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsEmailMessagesDraft");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
{: class="table-striped"}


### Return type

[**EmailMessage**](EmailMessage)


# **getConversationsEmailParticipantCommunicationWrapup**


> [AssignedWrapupCode](AssignedWrapupCode) getConversationsEmailParticipantCommunicationWrapup(conversationId, participantId, communicationId, provisional)

Get the wrap-up for this conversation communication. 

Wraps GET /api/v2/conversations/emails/{conversationId}/participants/{participantId}/communications/{communicationId}/wrapup  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
Boolean provisional = false; // Boolean | Indicates whether or not to fetch provisional wrap-up code.
try {
    AssignedWrapupCode result = apiInstance.getConversationsEmailParticipantCommunicationWrapup(conversationId, participantId, communicationId, provisional);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsEmailParticipantCommunicationWrapup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **communicationId** | **String**| communicationId | 
| **provisional** | **Boolean**| Indicates whether or not to fetch provisional wrap-up code. | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**AssignedWrapupCode**](AssignedWrapupCode)


# **getConversationsEmailParticipantWrapup**


> [AssignedWrapupCode](AssignedWrapupCode) getConversationsEmailParticipantWrapup(conversationId, participantId, provisional)

Get the wrap-up for this conversation participant. 

Wraps GET /api/v2/conversations/emails/{conversationId}/participants/{participantId}/wrapup  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
Boolean provisional = false; // Boolean | Indicates whether or not to fetch provisional wrap-up code.
try {
    AssignedWrapupCode result = apiInstance.getConversationsEmailParticipantWrapup(conversationId, participantId, provisional);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsEmailParticipantWrapup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **provisional** | **Boolean**| Indicates whether or not to fetch provisional wrap-up code. | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**AssignedWrapupCode**](AssignedWrapupCode)


# **getConversationsEmailParticipantWrapupcodes**


> [List&lt;WrapupCode&gt;](WrapupCode) getConversationsEmailParticipantWrapupcodes(conversationId, participantId)

Get list of wrapup codes for this conversation participant

Wraps GET /api/v2/conversations/emails/{conversationId}/participants/{participantId}/wrapupcodes  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
try {
    List<WrapupCode> result = apiInstance.getConversationsEmailParticipantWrapupcodes(conversationId, participantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsEmailParticipantWrapupcodes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
{: class="table-striped"}


### Return type

[**List&lt;WrapupCode&gt;**](WrapupCode)


# **getConversationsEmailSettings**


> [EmailsSettings](EmailsSettings) getConversationsEmailSettings(conversationId)

Get emails settings for a given conversation

Wraps GET /api/v2/conversations/emails/{conversationId}/settings  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
try {
    EmailsSettings result = apiInstance.getConversationsEmailSettings(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsEmailSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
{: class="table-striped"}


### Return type

[**EmailsSettings**](EmailsSettings)


# **getConversationsEmails**


> [EmailConversationEntityListing](EmailConversationEntityListing) getConversationsEmails()

Get active email conversations for the logged in user

Wraps GET /api/v2/conversations/emails  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
try {
    EmailConversationEntityListing result = apiInstance.getConversationsEmails();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsEmails");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**EmailConversationEntityListing**](EmailConversationEntityListing)


# **getConversationsInternalmessage**


> [InternalMessageConversation](InternalMessageConversation) getConversationsInternalmessage(conversationId)

Get internal message conversation

getConversationsInternalmessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/conversations/internalmessages/{conversationId}  

Requires ANY permissions: 

* conversation:internalMessaging:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
try {
    InternalMessageConversation result = apiInstance.getConversationsInternalmessage(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsInternalmessage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
{: class="table-striped"}


### Return type

[**InternalMessageConversation**](InternalMessageConversation)


# **getConversationsInternalmessages**


> [InternalMessageConversationEntityListing](InternalMessageConversationEntityListing) getConversationsInternalmessages()

Get active internal message conversations for the logged in user

getConversationsInternalmessages is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/conversations/internalmessages  

Requires ANY permissions: 

* conversation:internalMessaging:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
try {
    InternalMessageConversationEntityListing result = apiInstance.getConversationsInternalmessages();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsInternalmessages");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**InternalMessageConversationEntityListing**](InternalMessageConversationEntityListing)


# **getConversationsKeyconfiguration**


> [ConversationEncryptionConfiguration](ConversationEncryptionConfiguration) getConversationsKeyconfiguration(keyconfigurationsId)

Get the encryption key configurations

Wraps GET /api/v2/conversations/keyconfigurations/{keyconfigurationsId}  

Requires ANY permissions: 

* conversation:encryptionKey:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String keyconfigurationsId = "keyconfigurationsId_example"; // String | Key Configurations Id
try {
    ConversationEncryptionConfiguration result = apiInstance.getConversationsKeyconfiguration(keyconfigurationsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsKeyconfiguration");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **keyconfigurationsId** | **String**| Key Configurations Id | 
{: class="table-striped"}


### Return type

[**ConversationEncryptionConfiguration**](ConversationEncryptionConfiguration)


# **getConversationsKeyconfigurations**


> [ConversationEncryptionConfigurationListing](ConversationEncryptionConfigurationListing) getConversationsKeyconfigurations()

Get a list of key configurations data

Wraps GET /api/v2/conversations/keyconfigurations  

Requires ANY permissions: 

* conversation:encryptionKey:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
try {
    ConversationEncryptionConfigurationListing result = apiInstance.getConversationsKeyconfigurations();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsKeyconfigurations");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**ConversationEncryptionConfigurationListing**](ConversationEncryptionConfigurationListing)


# **getConversationsMessage**


> [MessageConversation](MessageConversation) getConversationsMessage(conversationId)

Get message conversation

Wraps GET /api/v2/conversations/messages/{conversationId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
try {
    MessageConversation result = apiInstance.getConversationsMessage(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
{: class="table-striped"}


### Return type

[**MessageConversation**](MessageConversation)


# **getConversationsMessageCommunicationMessagesMediaMediaId**


> [MessageMediaData](MessageMediaData) getConversationsMessageCommunicationMessagesMediaMediaId(conversationId, communicationId, mediaId)

Get media

See https://developer.genesys.cloud/api/rest/v2/conversations/messaging-media-upload for example usage.

Wraps GET /api/v2/conversations/messages/{conversationId}/communications/{communicationId}/messages/media/{mediaId}  

Requires ANY permissions: 

* conversation:message:view
* conversation:webmessaging:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String communicationId = "communicationId_example"; // String | communicationId
String mediaId = "mediaId_example"; // String | mediaId
try {
    MessageMediaData result = apiInstance.getConversationsMessageCommunicationMessagesMediaMediaId(conversationId, communicationId, mediaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessageCommunicationMessagesMediaMediaId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **communicationId** | **String**| communicationId | 
| **mediaId** | **String**| mediaId | 
{: class="table-striped"}


### Return type

[**MessageMediaData**](MessageMediaData)


# **getConversationsMessageDetails**


> [MessageData](MessageData) getConversationsMessageDetails(messageId, useNormalizedMessage)

Get message

Wraps GET /api/v2/conversations/messages/{messageId}/details  

Requires ANY permissions: 

* conversation:message:view
* conversation:webmessaging:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String messageId = "messageId_example"; // String | messageId
Boolean useNormalizedMessage = false; // Boolean | If true, response removes deprecated fields (textBody, media)
try {
    MessageData result = apiInstance.getConversationsMessageDetails(messageId, useNormalizedMessage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessageDetails");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **messageId** | **String**| messageId | 
| **useNormalizedMessage** | **Boolean**| If true, response removes deprecated fields (textBody, media) | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**MessageData**](MessageData)


# **getConversationsMessageMessage**


> [MessageData](MessageData) getConversationsMessageMessage(conversationId, messageId, useNormalizedMessage)

Get conversation message

Wraps GET /api/v2/conversations/messages/{conversationId}/messages/{messageId}  

Requires ANY permissions: 

* conversation:message:view
* conversation:webmessaging:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String messageId = "messageId_example"; // String | messageId
Boolean useNormalizedMessage = false; // Boolean | If true, response removes deprecated fields (textBody, media)
try {
    MessageData result = apiInstance.getConversationsMessageMessage(conversationId, messageId, useNormalizedMessage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessageMessage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **messageId** | **String**| messageId | 
| **useNormalizedMessage** | **Boolean**| If true, response removes deprecated fields (textBody, media) | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**MessageData**](MessageData)


# **getConversationsMessageParticipantCommunicationWrapup**


> [AssignedWrapupCode](AssignedWrapupCode) getConversationsMessageParticipantCommunicationWrapup(conversationId, participantId, communicationId, provisional)

Get the wrap-up for this conversation communication. 

Wraps GET /api/v2/conversations/messages/{conversationId}/participants/{participantId}/communications/{communicationId}/wrapup  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
Boolean provisional = false; // Boolean | Indicates whether or not to fetch provisional wrap-up code.
try {
    AssignedWrapupCode result = apiInstance.getConversationsMessageParticipantCommunicationWrapup(conversationId, participantId, communicationId, provisional);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessageParticipantCommunicationWrapup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **communicationId** | **String**| communicationId | 
| **provisional** | **Boolean**| Indicates whether or not to fetch provisional wrap-up code. | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**AssignedWrapupCode**](AssignedWrapupCode)


# **getConversationsMessageParticipantWrapup**


> [AssignedWrapupCode](AssignedWrapupCode) getConversationsMessageParticipantWrapup(conversationId, participantId, provisional)

Get the wrap-up for this conversation participant. 

Wraps GET /api/v2/conversations/messages/{conversationId}/participants/{participantId}/wrapup  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
Boolean provisional = false; // Boolean | Indicates whether or not to fetch provisional wrap-up code.
try {
    AssignedWrapupCode result = apiInstance.getConversationsMessageParticipantWrapup(conversationId, participantId, provisional);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessageParticipantWrapup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **provisional** | **Boolean**| Indicates whether or not to fetch provisional wrap-up code. | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**AssignedWrapupCode**](AssignedWrapupCode)


# **getConversationsMessageParticipantWrapupcodes**


> [List&lt;WrapupCode&gt;](WrapupCode) getConversationsMessageParticipantWrapupcodes(conversationId, participantId)

Get list of wrapup codes for this conversation participant

Wraps GET /api/v2/conversations/messages/{conversationId}/participants/{participantId}/wrapupcodes  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
try {
    List<WrapupCode> result = apiInstance.getConversationsMessageParticipantWrapupcodes(conversationId, participantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessageParticipantWrapupcodes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
{: class="table-striped"}


### Return type

[**List&lt;WrapupCode&gt;**](WrapupCode)


# **getConversationsMessages**


> [MessageConversationEntityListing](MessageConversationEntityListing) getConversationsMessages()

Get active message conversations for the logged in user

Wraps GET /api/v2/conversations/messages  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
try {
    MessageConversationEntityListing result = apiInstance.getConversationsMessages();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessages");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**MessageConversationEntityListing**](MessageConversationEntityListing)


# **getConversationsMessagesCachedmedia**


> [CachedMediaItemEntityListing](CachedMediaItemEntityListing) getConversationsMessagesCachedmedia(pageSize, pageNumber, url)

Get a list of cached media items

Wraps GET /api/v2/conversations/messages/cachedmedia  

Requires ANY permissions: 

* conversation:cachedMedia:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String url = "url_example"; // String | URL to search for
try {
    CachedMediaItemEntityListing result = apiInstance.getConversationsMessagesCachedmedia(pageSize, pageNumber, url);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagesCachedmedia");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **url** | **String**| URL to search for | [optional] 
{: class="table-striped"}


### Return type

[**CachedMediaItemEntityListing**](CachedMediaItemEntityListing)


# **getConversationsMessagesCachedmediaCachedMediaItemId**


> [CachedMediaItem](CachedMediaItem) getConversationsMessagesCachedmediaCachedMediaItemId(cachedMediaItemId)

Get a cached media item

Wraps GET /api/v2/conversations/messages/cachedmedia/{cachedMediaItemId}  

Requires ANY permissions: 

* conversation:cachedMedia:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String cachedMediaItemId = "cachedMediaItemId_example"; // String | cachedMediaItemId
try {
    CachedMediaItem result = apiInstance.getConversationsMessagesCachedmediaCachedMediaItemId(cachedMediaItemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagesCachedmediaCachedMediaItemId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cachedMediaItemId** | **String**| cachedMediaItemId | 
{: class="table-striped"}


### Return type

[**CachedMediaItem**](CachedMediaItem)


# **getConversationsMessagingFacebookApp**


> [FacebookAppCredentials](FacebookAppCredentials) getConversationsMessagingFacebookApp()

Get Genesys Facebook App Id

Wraps GET /api/v2/conversations/messaging/facebook/app  

Requires ALL permissions: 

* messaging:integration:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
try {
    FacebookAppCredentials result = apiInstance.getConversationsMessagingFacebookApp();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingFacebookApp");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**FacebookAppCredentials**](FacebookAppCredentials)


# **getConversationsMessagingFacebookPermissions**


> [FacebookPermissionEntityListing](FacebookPermissionEntityListing) getConversationsMessagingFacebookPermissions()

Get a list of Facebook Permissions

Wraps GET /api/v2/conversations/messaging/facebook/permissions  

Requires ANY permissions: 

* messaging:integration:add
* messaging:integration:edit
* messaging:conversationInstagramIntegration:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
try {
    FacebookPermissionEntityListing result = apiInstance.getConversationsMessagingFacebookPermissions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingFacebookPermissions");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**FacebookPermissionEntityListing**](FacebookPermissionEntityListing)


# **getConversationsMessagingIdentityresolutionIntegrationsAppleIntegrationId**


> [IdentityResolutionConfig](IdentityResolutionConfig) getConversationsMessagingIdentityresolutionIntegrationsAppleIntegrationId(integrationId)

Get Apple messaging integration identity resolution settings

Wraps GET /api/v2/conversations/messaging/identityresolution/integrations/apple/{integrationId}  

Requires ALL permissions: 

* messaging:integration:view
* messaging:identityResolutionApple:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
try {
    IdentityResolutionConfig result = apiInstance.getConversationsMessagingIdentityresolutionIntegrationsAppleIntegrationId(integrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingIdentityresolutionIntegrationsAppleIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
{: class="table-striped"}


### Return type

[**IdentityResolutionConfig**](IdentityResolutionConfig)


# **getConversationsMessagingIdentityresolutionIntegrationsFacebookIntegrationId**


> [IdentityResolutionConfig](IdentityResolutionConfig) getConversationsMessagingIdentityresolutionIntegrationsFacebookIntegrationId(integrationId)

Get Facebook messaging integration identity resolution settings

Wraps GET /api/v2/conversations/messaging/identityresolution/integrations/facebook/{integrationId}  

Requires ALL permissions: 

* messaging:integration:view
* messaging:identityResolutionFacebook:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
try {
    IdentityResolutionConfig result = apiInstance.getConversationsMessagingIdentityresolutionIntegrationsFacebookIntegrationId(integrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingIdentityresolutionIntegrationsFacebookIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
{: class="table-striped"}


### Return type

[**IdentityResolutionConfig**](IdentityResolutionConfig)


# **getConversationsMessagingIdentityresolutionIntegrationsInstagramIntegrationId**


> [IdentityResolutionConfig](IdentityResolutionConfig) getConversationsMessagingIdentityresolutionIntegrationsInstagramIntegrationId(integrationId)

Get an Instagram integration identity resolution settings

Wraps GET /api/v2/conversations/messaging/identityresolution/integrations/instagram/{integrationId}  

Requires ALL permissions: 

* messaging:integration:view
* messaging:identityResolutionInstagram:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
try {
    IdentityResolutionConfig result = apiInstance.getConversationsMessagingIdentityresolutionIntegrationsInstagramIntegrationId(integrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingIdentityresolutionIntegrationsInstagramIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
{: class="table-striped"}


### Return type

[**IdentityResolutionConfig**](IdentityResolutionConfig)


# **getConversationsMessagingIdentityresolutionIntegrationsOpenIntegrationId**


> [OpenMessagingIdentityResolutionConfig](OpenMessagingIdentityResolutionConfig) getConversationsMessagingIdentityresolutionIntegrationsOpenIntegrationId(integrationId)

Get an open messaging integration Identity Resolution settings

Wraps GET /api/v2/conversations/messaging/identityresolution/integrations/open/{integrationId}  

Requires ALL permissions: 

* messaging:integration:view
* messaging:identityResolutionOpen:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
try {
    OpenMessagingIdentityResolutionConfig result = apiInstance.getConversationsMessagingIdentityresolutionIntegrationsOpenIntegrationId(integrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingIdentityresolutionIntegrationsOpenIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
{: class="table-striped"}


### Return type

[**OpenMessagingIdentityResolutionConfig**](OpenMessagingIdentityResolutionConfig)


# **getConversationsMessagingIdentityresolutionIntegrationsTwitterIntegrationId**


> [IdentityResolutionConfig](IdentityResolutionConfig) getConversationsMessagingIdentityresolutionIntegrationsTwitterIntegrationId(integrationId)

Get X (Formally Twitter) messaging integration identity resolution settings

Wraps GET /api/v2/conversations/messaging/identityresolution/integrations/twitter/{integrationId}  

Requires ALL permissions: 

* messaging:integration:view
* messaging:identityResolutionX:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration Id
try {
    IdentityResolutionConfig result = apiInstance.getConversationsMessagingIdentityresolutionIntegrationsTwitterIntegrationId(integrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingIdentityresolutionIntegrationsTwitterIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration Id | 
{: class="table-striped"}


### Return type

[**IdentityResolutionConfig**](IdentityResolutionConfig)


# **getConversationsMessagingIdentityresolutionIntegrationsWhatsappIntegrationId**


> [IdentityResolutionConfig](IdentityResolutionConfig) getConversationsMessagingIdentityresolutionIntegrationsWhatsappIntegrationId(integrationId)

Get a whatsApp integration Identity Resolution settings

Wraps GET /api/v2/conversations/messaging/identityresolution/integrations/whatsapp/{integrationId}  

Requires ALL permissions: 

* messaging:integration:view
* messaging:identityResolutionWhatsApp:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
try {
    IdentityResolutionConfig result = apiInstance.getConversationsMessagingIdentityresolutionIntegrationsWhatsappIntegrationId(integrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingIdentityresolutionIntegrationsWhatsappIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
{: class="table-striped"}


### Return type

[**IdentityResolutionConfig**](IdentityResolutionConfig)


# **getConversationsMessagingIntegrationTwitterOauthSettings**


> [TwitterOAuthSettings](TwitterOAuthSettings) getConversationsMessagingIntegrationTwitterOauthSettings(integrationId)

Get twitter oauth settings to patch an integration

Wraps GET /api/v2/conversations/messaging/integrations/{integrationId}/twitter/oauth/settings  

Requires ALL permissions: 

* messaging:XIntegration:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration Id of an existing integration that needs to be patched with new oauth settings
try {
    TwitterOAuthSettings result = apiInstance.getConversationsMessagingIntegrationTwitterOauthSettings(integrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingIntegrationTwitterOauthSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration Id of an existing integration that needs to be patched with new oauth settings | 
{: class="table-striped"}


### Return type

[**TwitterOAuthSettings**](TwitterOAuthSettings)


# **getConversationsMessagingIntegrations**


> [MessagingIntegrationEntityListing](MessagingIntegrationEntityListing) getConversationsMessagingIntegrations(pageSize, pageNumber, expand, supportedContentId, messagingSettingId)

Get a list of Integrations

Wraps GET /api/v2/conversations/messaging/integrations  

Requires ALL permissions: 

* messaging:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
List<String> expand = Arrays.asList(null); // List<String> | Expand instructions for the return value.
String supportedContentId = "supportedContentId_example"; // String | Filter integrations returned based on the supported content ID
String messagingSettingId = "messagingSettingId_example"; // String | Filter integrations returned based on the setting ID
try {
    MessagingIntegrationEntityListing result = apiInstance.getConversationsMessagingIntegrations(pageSize, pageNumber, expand, supportedContentId, messagingSettingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingIntegrations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **expand** | [**List&lt;String&gt;**](String)| Expand instructions for the return value. | [optional]<br />**Values**: supportedContent, messagingSetting, identityresolution 
| **supportedContentId** | **String**| Filter integrations returned based on the supported content ID | [optional] 
| **messagingSettingId** | **String**| Filter integrations returned based on the setting ID | [optional] 
{: class="table-striped"}


### Return type

[**MessagingIntegrationEntityListing**](MessagingIntegrationEntityListing)


# **getConversationsMessagingIntegrationsApple**


> [AppleIntegrationEntityListing](AppleIntegrationEntityListing) getConversationsMessagingIntegrationsApple(pageSize, pageNumber, expand, supportedContentId, messagingSettingId)

Get a list of Apple Integrations

Wraps GET /api/v2/conversations/messaging/integrations/apple  

Requires ALL permissions: 

* messaging:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String expand = "expand_example"; // String | Expand instructions for the return value.
String supportedContentId = "supportedContentId_example"; // String | Filter integrations returned based on the supported content ID
String messagingSettingId = "messagingSettingId_example"; // String | Filter integrations returned based on the setting ID
try {
    AppleIntegrationEntityListing result = apiInstance.getConversationsMessagingIntegrationsApple(pageSize, pageNumber, expand, supportedContentId, messagingSettingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingIntegrationsApple");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **expand** | **String**| Expand instructions for the return value. | [optional]<br />**Values**: supportedContent, messagingSetting, identityresolution 
| **supportedContentId** | **String**| Filter integrations returned based on the supported content ID | [optional] 
| **messagingSettingId** | **String**| Filter integrations returned based on the setting ID | [optional] 
{: class="table-striped"}


### Return type

[**AppleIntegrationEntityListing**](AppleIntegrationEntityListing)


# **getConversationsMessagingIntegrationsAppleIntegrationId**


> [AppleIntegration](AppleIntegration) getConversationsMessagingIntegrationsAppleIntegrationId(integrationId, expand)

Get an Apple messaging integration

Wraps GET /api/v2/conversations/messaging/integrations/apple/{integrationId}  

Requires ALL permissions: 

* messaging:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
String expand = "expand_example"; // String | Expand instructions for the return value.
try {
    AppleIntegration result = apiInstance.getConversationsMessagingIntegrationsAppleIntegrationId(integrationId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingIntegrationsAppleIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
| **expand** | **String**| Expand instructions for the return value. | [optional]<br />**Values**: supportedContent, messagingSetting, identityresolution 
{: class="table-striped"}


### Return type

[**AppleIntegration**](AppleIntegration)


# **getConversationsMessagingIntegrationsFacebook**


> [FacebookIntegrationEntityListing](FacebookIntegrationEntityListing) getConversationsMessagingIntegrationsFacebook(pageSize, pageNumber, expand, supportedContentId, messagingSettingId)

Get a list of Facebook Integrations

Wraps GET /api/v2/conversations/messaging/integrations/facebook  

Requires ALL permissions: 

* messaging:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String expand = "expand_example"; // String | Expand instructions for the return value.
String supportedContentId = "supportedContentId_example"; // String | Filter integrations returned based on the supported content ID
String messagingSettingId = "messagingSettingId_example"; // String | Filter integrations returned based on the setting ID
try {
    FacebookIntegrationEntityListing result = apiInstance.getConversationsMessagingIntegrationsFacebook(pageSize, pageNumber, expand, supportedContentId, messagingSettingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingIntegrationsFacebook");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **expand** | **String**| Expand instructions for the return value. | [optional]<br />**Values**: supportedContent, messagingSetting, identityresolution 
| **supportedContentId** | **String**| Filter integrations returned based on the supported content ID | [optional] 
| **messagingSettingId** | **String**| Filter integrations returned based on the setting ID | [optional] 
{: class="table-striped"}


### Return type

[**FacebookIntegrationEntityListing**](FacebookIntegrationEntityListing)


# **getConversationsMessagingIntegrationsFacebookIntegrationId**


> [FacebookIntegration](FacebookIntegration) getConversationsMessagingIntegrationsFacebookIntegrationId(integrationId, expand)

Get a Facebook messaging integration

Wraps GET /api/v2/conversations/messaging/integrations/facebook/{integrationId}  

Requires ALL permissions: 

* messaging:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
String expand = "expand_example"; // String | Expand instructions for the return value.
try {
    FacebookIntegration result = apiInstance.getConversationsMessagingIntegrationsFacebookIntegrationId(integrationId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingIntegrationsFacebookIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
| **expand** | **String**| Expand instructions for the return value. | [optional]<br />**Values**: supportedContent, messagingSetting, identityresolution 
{: class="table-striped"}


### Return type

[**FacebookIntegration**](FacebookIntegration)


# **getConversationsMessagingIntegrationsInstagram**


> [InstagramIntegrationEntityListing](InstagramIntegrationEntityListing) getConversationsMessagingIntegrationsInstagram(pageSize, pageNumber, expand, supportedContentId, messagingSettingId)

Get a list of Instagram Integrations

Wraps GET /api/v2/conversations/messaging/integrations/instagram  

Requires ALL permissions: 

* messaging:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String expand = "expand_example"; // String | Expand instructions for the return value.
String supportedContentId = "supportedContentId_example"; // String | Filter integrations returned based on the supported content ID
String messagingSettingId = "messagingSettingId_example"; // String | Filter integrations returned based on the setting ID
try {
    InstagramIntegrationEntityListing result = apiInstance.getConversationsMessagingIntegrationsInstagram(pageSize, pageNumber, expand, supportedContentId, messagingSettingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingIntegrationsInstagram");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **expand** | **String**| Expand instructions for the return value. | [optional]<br />**Values**: supportedContent, messagingSetting, identityresolution 
| **supportedContentId** | **String**| Filter integrations returned based on the supported content ID | [optional] 
| **messagingSettingId** | **String**| Filter integrations returned based on the setting ID | [optional] 
{: class="table-striped"}


### Return type

[**InstagramIntegrationEntityListing**](InstagramIntegrationEntityListing)


# **getConversationsMessagingIntegrationsInstagramIntegrationId**


> [InstagramIntegration](InstagramIntegration) getConversationsMessagingIntegrationsInstagramIntegrationId(integrationId, expand)

Get Instagram messaging integration

Wraps GET /api/v2/conversations/messaging/integrations/instagram/{integrationId}  

Requires ALL permissions: 

* messaging:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
String expand = "expand_example"; // String | Expand instructions for the return value.
try {
    InstagramIntegration result = apiInstance.getConversationsMessagingIntegrationsInstagramIntegrationId(integrationId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingIntegrationsInstagramIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
| **expand** | **String**| Expand instructions for the return value. | [optional]<br />**Values**: supportedContent, messagingSetting, identityresolution 
{: class="table-striped"}


### Return type

[**InstagramIntegration**](InstagramIntegration)


# **getConversationsMessagingIntegrationsOpen**


> [OpenIntegrationEntityListing](OpenIntegrationEntityListing) getConversationsMessagingIntegrationsOpen(pageSize, pageNumber, expand, supportedContentId, messagingSettingId)

Get a list of Open messaging integrations

See https://developer.genesys.cloud/api/digital/openmessaging/ for more information.

Wraps GET /api/v2/conversations/messaging/integrations/open  

Requires ALL permissions: 

* messaging:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String expand = "expand_example"; // String | Expand instructions for the return value.
String supportedContentId = "supportedContentId_example"; // String | Filter integrations returned based on the supported content ID
String messagingSettingId = "messagingSettingId_example"; // String | Filter integrations returned based on the setting ID
try {
    OpenIntegrationEntityListing result = apiInstance.getConversationsMessagingIntegrationsOpen(pageSize, pageNumber, expand, supportedContentId, messagingSettingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingIntegrationsOpen");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **expand** | **String**| Expand instructions for the return value. | [optional]<br />**Values**: supportedContent, messagingSetting, identityresolution 
| **supportedContentId** | **String**| Filter integrations returned based on the supported content ID | [optional] 
| **messagingSettingId** | **String**| Filter integrations returned based on the setting ID | [optional] 
{: class="table-striped"}


### Return type

[**OpenIntegrationEntityListing**](OpenIntegrationEntityListing)


# **getConversationsMessagingIntegrationsOpenIntegrationId**


> [OpenIntegration](OpenIntegration) getConversationsMessagingIntegrationsOpenIntegrationId(integrationId, expand)

Get an Open messaging integration

See https://developer.genesys.cloud/api/digital/openmessaging/ for more information.

Wraps GET /api/v2/conversations/messaging/integrations/open/{integrationId}  

Requires ALL permissions: 

* messaging:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
String expand = "expand_example"; // String | Expand instructions for the return value.
try {
    OpenIntegration result = apiInstance.getConversationsMessagingIntegrationsOpenIntegrationId(integrationId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingIntegrationsOpenIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
| **expand** | **String**| Expand instructions for the return value. | [optional]<br />**Values**: supportedContent, messagingSetting, identityresolution 
{: class="table-striped"}


### Return type

[**OpenIntegration**](OpenIntegration)


# **getConversationsMessagingIntegrationsTwitter**


> [TwitterIntegrationEntityListing](TwitterIntegrationEntityListing) getConversationsMessagingIntegrationsTwitter(pageSize, pageNumber, expand, supportedContentId, messagingSettingId)

Get a list of Twitter Integrations

Wraps GET /api/v2/conversations/messaging/integrations/twitter  

Requires ALL permissions: 

* messaging:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String expand = "expand_example"; // String | Expand instructions for the return value.
String supportedContentId = "supportedContentId_example"; // String | Filter integrations returned based on the supported content ID
String messagingSettingId = "messagingSettingId_example"; // String | Filter integrations returned based on the setting ID
try {
    TwitterIntegrationEntityListing result = apiInstance.getConversationsMessagingIntegrationsTwitter(pageSize, pageNumber, expand, supportedContentId, messagingSettingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingIntegrationsTwitter");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **expand** | **String**| Expand instructions for the return value. | [optional]<br />**Values**: supportedContent, messagingSetting, identityresolution 
| **supportedContentId** | **String**| Filter integrations returned based on the supported content ID | [optional] 
| **messagingSettingId** | **String**| Filter integrations returned based on the setting ID | [optional] 
{: class="table-striped"}


### Return type

[**TwitterIntegrationEntityListing**](TwitterIntegrationEntityListing)


# **getConversationsMessagingIntegrationsTwitterIntegrationId**


> [TwitterIntegration](TwitterIntegration) getConversationsMessagingIntegrationsTwitterIntegrationId(integrationId, expand)

Get Twitter messaging integration

Wraps GET /api/v2/conversations/messaging/integrations/twitter/{integrationId}  

Requires ALL permissions: 

* messaging:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
String expand = "expand_example"; // String | Expand instructions for the return value.
try {
    TwitterIntegration result = apiInstance.getConversationsMessagingIntegrationsTwitterIntegrationId(integrationId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingIntegrationsTwitterIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
| **expand** | **String**| Expand instructions for the return value. | [optional]<br />**Values**: supportedContent, messagingSetting, identityresolution 
{: class="table-striped"}


### Return type

[**TwitterIntegration**](TwitterIntegration)


# **getConversationsMessagingIntegrationsTwitterOauthSettings**


> [TwitterSignupOAuthSettings](TwitterSignupOAuthSettings) getConversationsMessagingIntegrationsTwitterOauthSettings()

Get twitter oauth settings

Wraps GET /api/v2/conversations/messaging/integrations/twitter/oauth/settings  

Requires ALL permissions: 

* messaging:XIntegration:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
try {
    TwitterSignupOAuthSettings result = apiInstance.getConversationsMessagingIntegrationsTwitterOauthSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingIntegrationsTwitterOauthSettings");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**TwitterSignupOAuthSettings**](TwitterSignupOAuthSettings)


# **getConversationsMessagingIntegrationsWhatsapp**


> [WhatsAppIntegrationEntityListing](WhatsAppIntegrationEntityListing) getConversationsMessagingIntegrationsWhatsapp(pageSize, pageNumber, expand, supportedContentId, messagingSettingId)

Get a list of WhatsApp Integrations

Wraps GET /api/v2/conversations/messaging/integrations/whatsapp  

Requires ALL permissions: 

* messaging:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String expand = "expand_example"; // String | Expand instructions for the return value.
String supportedContentId = "supportedContentId_example"; // String | Filter integrations returned based on the supported content ID
String messagingSettingId = "messagingSettingId_example"; // String | Filter integrations returned based on the setting ID
try {
    WhatsAppIntegrationEntityListing result = apiInstance.getConversationsMessagingIntegrationsWhatsapp(pageSize, pageNumber, expand, supportedContentId, messagingSettingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingIntegrationsWhatsapp");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **expand** | **String**| Expand instructions for the return value. | [optional]<br />**Values**: supportedContent, messagingSetting, identityresolution 
| **supportedContentId** | **String**| Filter integrations returned based on the supported content ID | [optional] 
| **messagingSettingId** | **String**| Filter integrations returned based on the setting ID | [optional] 
{: class="table-striped"}


### Return type

[**WhatsAppIntegrationEntityListing**](WhatsAppIntegrationEntityListing)


# **getConversationsMessagingIntegrationsWhatsappIntegrationId**


> [WhatsAppIntegration](WhatsAppIntegration) getConversationsMessagingIntegrationsWhatsappIntegrationId(integrationId, expand)

Get a WhatsApp messaging integration

Wraps GET /api/v2/conversations/messaging/integrations/whatsapp/{integrationId}  

Requires ALL permissions: 

* messaging:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
String expand = "expand_example"; // String | Expand instructions for the return value.
try {
    WhatsAppIntegration result = apiInstance.getConversationsMessagingIntegrationsWhatsappIntegrationId(integrationId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingIntegrationsWhatsappIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
| **expand** | **String**| Expand instructions for the return value. | [optional]<br />**Values**: supportedContent, messagingSetting, identityresolution 
{: class="table-striped"}


### Return type

[**WhatsAppIntegration**](WhatsAppIntegration)


# **getConversationsMessagingOauthAppleCallback**


> [OAuthAppleAuthorizationResponse](OAuthAppleAuthorizationResponse) getConversationsMessagingOauthAppleCallback(code, state, error)

Call Authentication provider callback to validate state and code

Wraps GET /api/v2/conversations/messaging/oauth/apple/callback  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.ConversationsApi;


ConversationsApi apiInstance = new ConversationsApi();
String code = "code_example"; // String | The authorization code to be sent to the authentication server during the token request.
String state = "state_example"; // String | The state/nonce value generated by Genesys Auth-Client Service.
String error = "error_example"; // String | Error parameter from OAuth provider
try {
    OAuthAppleAuthorizationResponse result = apiInstance.getConversationsMessagingOauthAppleCallback(code, state, error);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingOauthAppleCallback");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **code** | **String**| The authorization code to be sent to the authentication server during the token request. | 
| **state** | **String**| The state/nonce value generated by Genesys Auth-Client Service. | 
| **error** | **String**| Error parameter from OAuth provider | [optional] 
{: class="table-striped"}


### Return type

[**OAuthAppleAuthorizationResponse**](OAuthAppleAuthorizationResponse)


# **getConversationsMessagingSetting**


> [MessagingSetting](MessagingSetting) getConversationsMessagingSetting(messageSettingId)

Get a messaging setting

Wraps GET /api/v2/conversations/messaging/settings/{messageSettingId}  

Requires ALL permissions: 

* messaging:setting:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String messageSettingId = "messageSettingId_example"; // String | Message Setting ID
try {
    MessagingSetting result = apiInstance.getConversationsMessagingSetting(messageSettingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingSetting");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **messageSettingId** | **String**| Message Setting ID | 
{: class="table-striped"}


### Return type

[**MessagingSetting**](MessagingSetting)


# **getConversationsMessagingSettings**


> [MessagingConfigListing](MessagingConfigListing) getConversationsMessagingSettings(pageSize, pageNumber)

Get a list of messaging settings

Wraps GET /api/v2/conversations/messaging/settings  

Requires ALL permissions: 

* messaging:setting:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    MessagingConfigListing result = apiInstance.getConversationsMessagingSettings(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**MessagingConfigListing**](MessagingConfigListing)


# **getConversationsMessagingSettingsDefault**


> [MessagingSetting](MessagingSetting) getConversationsMessagingSettingsDefault()

Get the organization's default settings that will be used as the default when creating an integration.

When an integration is created a settings ID may be assigned to it. If the settings ID is not supplied, the default settings will be assigned to it.

Wraps GET /api/v2/conversations/messaging/settings/default  

Requires ALL permissions: 

* messaging:setting:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
try {
    MessagingSetting result = apiInstance.getConversationsMessagingSettingsDefault();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingSettingsDefault");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**MessagingSetting**](MessagingSetting)


# **getConversationsMessagingSupportedcontent**


> [SupportedContentListing](SupportedContentListing) getConversationsMessagingSupportedcontent(pageSize, pageNumber)

Get a list of Supported Content profiles

Wraps GET /api/v2/conversations/messaging/supportedcontent  

Requires ALL permissions: 

* messaging:supportedContent:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    SupportedContentListing result = apiInstance.getConversationsMessagingSupportedcontent(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingSupportedcontent");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**SupportedContentListing**](SupportedContentListing)


# **getConversationsMessagingSupportedcontentDefault**


> [SupportedContent](SupportedContent) getConversationsMessagingSupportedcontentDefault()

Get the organization's default supported content profile that will be used as the default when creating an integration.

When an integration is created a supported content ID may be assigned to it. If the supported content ID is not supplied, the default supported content profile will be assigned to it.

Wraps GET /api/v2/conversations/messaging/supportedcontent/default  

Requires ALL permissions: 

* messaging:supportedContent:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
try {
    SupportedContent result = apiInstance.getConversationsMessagingSupportedcontentDefault();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingSupportedcontentDefault");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**SupportedContent**](SupportedContent)


# **getConversationsMessagingSupportedcontentSupportedContentId**


> [SupportedContent](SupportedContent) getConversationsMessagingSupportedcontentSupportedContentId(supportedContentId)

Get a supported content profile

Wraps GET /api/v2/conversations/messaging/supportedcontent/{supportedContentId}  

Requires ALL permissions: 

* messaging:supportedContent:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String supportedContentId = "supportedContentId_example"; // String | Supported Content ID
try {
    SupportedContent result = apiInstance.getConversationsMessagingSupportedcontentSupportedContentId(supportedContentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingSupportedcontentSupportedContentId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **supportedContentId** | **String**| Supported Content ID | 
{: class="table-striped"}


### Return type

[**SupportedContent**](SupportedContent)


# **getConversationsMessagingThreadingtimeline**


> [ConversationThreadingWindow](ConversationThreadingWindow) getConversationsMessagingThreadingtimeline()

Get conversation threading window timeline for each messaging type

Conversation messaging threading timeline is a setting defined for each messenger type in your organization. This setting will dictate whether a new message is added to the most recent existing conversation, or creates a new Conversation. If the existing Conversation is still in a connected state the threading timeline setting will never play a role. After the conversation is disconnected, if an inbound message is received or an outbound message is sent after the setting for threading timeline expires, a new conversation is created.

Wraps GET /api/v2/conversations/messaging/threadingtimeline  

Requires ALL permissions: 

* conversation:threadingTimeline:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
try {
    ConversationThreadingWindow result = apiInstance.getConversationsMessagingThreadingtimeline();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingThreadingtimeline");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**ConversationThreadingWindow**](ConversationThreadingWindow)


# **getConversationsScreenshareParticipantCommunicationWrapup**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [AssignedWrapupCode](AssignedWrapupCode) getConversationsScreenshareParticipantCommunicationWrapup(conversationId, participantId, communicationId, provisional)

Get the wrap-up for this conversation communication. 

This endpoint is deprecated. Please see the article https://help.genesys.cloud/articles/deprecation-legacy-co-browse-and-screenshare/

Wraps GET /api/v2/conversations/screenshares/{conversationId}/participants/{participantId}/communications/{communicationId}/wrapup  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
Boolean provisional = false; // Boolean | Indicates whether or not to fetch provisional wrap-up code.
try {
    AssignedWrapupCode result = apiInstance.getConversationsScreenshareParticipantCommunicationWrapup(conversationId, participantId, communicationId, provisional);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsScreenshareParticipantCommunicationWrapup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **communicationId** | **String**| communicationId | 
| **provisional** | **Boolean**| Indicates whether or not to fetch provisional wrap-up code. | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**AssignedWrapupCode**](AssignedWrapupCode)


# **getConversationsSettings**


> [Settings](Settings) getConversationsSettings()

Get Settings

Wraps GET /api/v2/conversations/settings  

Requires ANY permissions: 

* conversation:settings:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
try {
    Settings result = apiInstance.getConversationsSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsSettings");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**Settings**](Settings)


# **getConversationsSocialParticipantCommunicationWrapup**


> [AssignedWrapupCode](AssignedWrapupCode) getConversationsSocialParticipantCommunicationWrapup(conversationId, participantId, communicationId, provisional)

Get the wrap-up for this conversation communication. 

Wraps GET /api/v2/conversations/socials/{conversationId}/participants/{participantId}/communications/{communicationId}/wrapup  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
Boolean provisional = false; // Boolean | Indicates whether or not to fetch provisional wrap-up code.
try {
    AssignedWrapupCode result = apiInstance.getConversationsSocialParticipantCommunicationWrapup(conversationId, participantId, communicationId, provisional);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsSocialParticipantCommunicationWrapup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **communicationId** | **String**| communicationId | 
| **provisional** | **Boolean**| Indicates whether or not to fetch provisional wrap-up code. | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**AssignedWrapupCode**](AssignedWrapupCode)


# **getConversationsVideoDetails**


> [VideoConferenceDetails](VideoConferenceDetails) getConversationsVideoDetails(conferenceId)

Get video conference details (e.g. the current number of active participants).

getConversationsVideoDetails is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/conversations/videos/{conferenceId}/details  

Requires ANY permissions: 

* video:video:access

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conferenceId = "conferenceId_example"; // String | conferenceId
try {
    VideoConferenceDetails result = apiInstance.getConversationsVideoDetails(conferenceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsVideoDetails");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conferenceId** | **String**| conferenceId | 
{: class="table-striped"}


### Return type

[**VideoConferenceDetails**](VideoConferenceDetails)


# **getConversationsVideoParticipantCommunicationWrapup**


> [AssignedWrapupCode](AssignedWrapupCode) getConversationsVideoParticipantCommunicationWrapup(conversationId, participantId, communicationId, provisional)

Get the wrap-up for this conversation communication. 

Wraps GET /api/v2/conversations/videos/{conversationId}/participants/{participantId}/communications/{communicationId}/wrapup  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
Boolean provisional = false; // Boolean | Indicates whether or not to fetch provisional wrap-up code.
try {
    AssignedWrapupCode result = apiInstance.getConversationsVideoParticipantCommunicationWrapup(conversationId, participantId, communicationId, provisional);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsVideoParticipantCommunicationWrapup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **communicationId** | **String**| communicationId | 
| **provisional** | **Boolean**| Indicates whether or not to fetch provisional wrap-up code. | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**AssignedWrapupCode**](AssignedWrapupCode)


# **getConversationsVideosMeeting**


> [MeetingIdRecord](MeetingIdRecord) getConversationsVideosMeeting(meetingId)

Gets a record for a given meetingId

getConversationsVideosMeeting is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/conversations/videos/meetings/{meetingId}  

Requires ANY permissions: 

* video:video:access

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String meetingId = "meetingId_example"; // String | meetingId
try {
    MeetingIdRecord result = apiInstance.getConversationsVideosMeeting(meetingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsVideosMeeting");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **meetingId** | **String**| meetingId | 
{: class="table-striped"}


### Return type

[**MeetingIdRecord**](MeetingIdRecord)


# **patchConversationParticipant**


> Void patchConversationParticipant(conversationId, participantId, body)

Update a participant.

Update conversation participant.

Wraps PATCH /api/v2/conversations/{conversationId}/participants/{participantId}  

Requires ANY permissions: 

* conversation:participant:wrapup
* conversation:call:record
* conversation:communication:disconnect

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Update request
try {
    apiInstance.patchConversationParticipant(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationParticipant");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | 
| **participantId** | **String**| participant ID | 
| **body** | [**MediaParticipantRequest**](MediaParticipantRequest)| Update request | 
{: class="table-striped"}


### Return type

null (empty response body)


# **patchConversationParticipantAttributes**


> Void patchConversationParticipantAttributes(conversationId, participantId, body)

Update the attributes on a conversation participant.

Wraps PATCH /api/v2/conversations/{conversationId}/participants/{participantId}/attributes  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
ParticipantAttributes body = new ParticipantAttributes(); // ParticipantAttributes | Participant attributes
try {
    apiInstance.patchConversationParticipantAttributes(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationParticipantAttributes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | 
| **participantId** | **String**| participant ID | 
| **body** | [**ParticipantAttributes**](ParticipantAttributes)| Participant attributes | 
{: class="table-striped"}


### Return type

null (empty response body)


# **patchConversationRecordingstate**


> Void patchConversationRecordingstate(conversationId, body)

Update a conversation by setting its recording state

Wraps PATCH /api/v2/conversations/{conversationId}/recordingstate  

Requires ANY permissions: 

* conversation:recording:pauseOthers

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
SetRecordingState body = new SetRecordingState(); // SetRecordingState | SetRecordingState
try {
    apiInstance.patchConversationRecordingstate(conversationId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationRecordingstate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | 
| **body** | [**SetRecordingState**](SetRecordingState)| SetRecordingState | 
{: class="table-striped"}


### Return type

null (empty response body)


# **patchConversationSecureattributes**


> String patchConversationSecureattributes(conversationId, body)

Update the secure attributes on a conversation.

Wraps PATCH /api/v2/conversations/{conversationId}/secureattributes  

Requires ANY permissions: 

* conversation:participant:attributesedit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
ConversationSecureAttributes body = new ConversationSecureAttributes(); // ConversationSecureAttributes | Conversation Secure Attributes
try {
    String result = apiInstance.patchConversationSecureattributes(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationSecureattributes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | 
| **body** | [**ConversationSecureAttributes**](ConversationSecureAttributes)| Conversation Secure Attributes | 
{: class="table-striped"}


### Return type

**String**


# **patchConversationSummaryEngagements**


> Void patchConversationSummaryEngagements(conversationId, summaryId, body)

Update agent's engagement for the summary.

Wraps PATCH /api/v2/conversations/{conversationId}/summaries/{summaryId}/engagements  

Requires ALL permissions: 

* conversation:summaryEngagement:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String summaryId = "summaryId_example"; // String | Summary ID
EngagementRequest body = new EngagementRequest(); // EngagementRequest | 
try {
    apiInstance.patchConversationSummaryEngagements(conversationId, summaryId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationSummaryEngagements");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| Conversation ID | 
| **summaryId** | **String**| Summary ID | 
| **body** | [**EngagementRequest**](EngagementRequest)|  | [optional] 
{: class="table-striped"}


### Return type

null (empty response body)


# **patchConversationSummaryFeedback**


> Void patchConversationSummaryFeedback(conversationId, summaryId, body)

Update the feedback for the summary.

Wraps PATCH /api/v2/conversations/{conversationId}/summaries/{summaryId}/feedback  

Requires ALL permissions: 

* conversation:summaryFeedback:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String summaryId = "summaryId_example"; // String | Summary ID
FeedbackUpdateRequest body = new FeedbackUpdateRequest(); // FeedbackUpdateRequest | 
try {
    apiInstance.patchConversationSummaryFeedback(conversationId, summaryId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationSummaryFeedback");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| Conversation ID | 
| **summaryId** | **String**| Summary ID | 
| **body** | [**FeedbackUpdateRequest**](FeedbackUpdateRequest)|  | [optional] 
{: class="table-striped"}


### Return type

null (empty response body)


# **patchConversationUtilizationlabel**


> String patchConversationUtilizationlabel(conversationId, body)

Update the utilization label on a conversation. When there is no value provided, the system default label is applied

Wraps PATCH /api/v2/conversations/{conversationId}/utilizationlabel  

Requires ANY permissions: 

* conversation:utilizationLabel:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
ConversationUtilizationLabelUpdate body = new ConversationUtilizationLabelUpdate(); // ConversationUtilizationLabelUpdate | Conversation Utilization Label
try {
    String result = apiInstance.patchConversationUtilizationlabel(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationUtilizationlabel");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | 
| **body** | [**ConversationUtilizationLabelUpdate**](ConversationUtilizationLabelUpdate)| Conversation Utilization Label | 
{: class="table-striped"}


### Return type

**String**


# **patchConversationsAftercallworkConversationIdParticipantCommunication**


> [AfterCallWorkUpdate](AfterCallWorkUpdate) patchConversationsAftercallworkConversationIdParticipantCommunication(conversationId, participantId, communicationId, body)

Update after-call work for this conversation communication.

Wraps PATCH /api/v2/conversations/aftercallwork/{conversationId}/participants/{participantId}/communications/{communicationId}  

Requires ANY permissions: 

* conversation:participant:wrapup

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
AfterCallWorkUpdate body = new AfterCallWorkUpdate(); // AfterCallWorkUpdate | AfterCallWorkUpdate
try {
    AfterCallWorkUpdate result = apiInstance.patchConversationsAftercallworkConversationIdParticipantCommunication(conversationId, participantId, communicationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsAftercallworkConversationIdParticipantCommunication");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **communicationId** | **String**| communicationId | 
| **body** | [**AfterCallWorkUpdate**](AfterCallWorkUpdate)| AfterCallWorkUpdate | 
{: class="table-striped"}


### Return type

[**AfterCallWorkUpdate**](AfterCallWorkUpdate)


# **patchConversationsCall**


> [Conversation](Conversation) patchConversationsCall(conversationId, body)

Update a conversation by setting its recording state, merging in other conversations to create a conference, or disconnecting all of the participants

Wraps PATCH /api/v2/conversations/calls/{conversationId}  

Requires ANY permissions: 

* conversation:communication:disconnect

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
Conversation body = new Conversation(); // Conversation | Conversation
try {
    Conversation result = apiInstance.patchConversationsCall(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCall");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **body** | [**Conversation**](Conversation)| Conversation | 
{: class="table-striped"}


### Return type

[**Conversation**](Conversation)


# **patchConversationsCallConference**


> Void patchConversationsCallConference(conversationId, body)

Update a conversation by merging in other conversations to create a conference

Wraps PATCH /api/v2/conversations/calls/{conversationId}/conference  

Requires ANY permissions: 

* conversation:conference:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
UpdateConferenceRequest body = new UpdateConferenceRequest(); // UpdateConferenceRequest | UpdateConferenceRequest
try {
    apiInstance.patchConversationsCallConference(conversationId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCallConference");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **body** | [**UpdateConferenceRequest**](UpdateConferenceRequest)| UpdateConferenceRequest | 
{: class="table-striped"}


### Return type

null (empty response body)


# **patchConversationsCallParticipant**


> Void patchConversationsCallParticipant(conversationId, participantId, body)

Update conversation participant

Wraps PATCH /api/v2/conversations/calls/{conversationId}/participants/{participantId}  

Requires ANY permissions: 

* conversation:participant:wrapup
* conversation:call:record
* conversation:communication:disconnect

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Participant request
try {
    apiInstance.patchConversationsCallParticipant(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCallParticipant");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **body** | [**MediaParticipantRequest**](MediaParticipantRequest)| Participant request | 
{: class="table-striped"}


### Return type

null (empty response body)


# **patchConversationsCallParticipantAttributes**


> [ParticipantAttributes](ParticipantAttributes) patchConversationsCallParticipantAttributes(conversationId, participantId, body)

Update the attributes on a conversation participant.

Wraps PATCH /api/v2/conversations/calls/{conversationId}/participants/{participantId}/attributes  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
ParticipantAttributes body = new ParticipantAttributes(); // ParticipantAttributes | Participant attributes
try {
    ParticipantAttributes result = apiInstance.patchConversationsCallParticipantAttributes(conversationId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCallParticipantAttributes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **body** | [**ParticipantAttributes**](ParticipantAttributes)| Participant attributes | 
{: class="table-striped"}


### Return type

[**ParticipantAttributes**](ParticipantAttributes)


# **patchConversationsCallParticipantCommunication**


> Empty patchConversationsCallParticipantCommunication(conversationId, participantId, communicationId, body)

Update conversation participant's communication by disconnecting it. This endpoint does not update wrapup.

Wraps PATCH /api/v2/conversations/calls/{conversationId}/participants/{participantId}/communications/{communicationId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Participant
try {
    Empty result = apiInstance.patchConversationsCallParticipantCommunication(conversationId, participantId, communicationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCallParticipantCommunication");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **communicationId** | **String**| communicationId | 
| **body** | [**MediaParticipantRequest**](MediaParticipantRequest)| Participant | 
{: class="table-striped"}


### Return type

**Empty**


# **patchConversationsCallParticipantConsult**


> [ConsultTransferResponse](ConsultTransferResponse) patchConversationsCallParticipantConsult(conversationId, participantId, body)

Change who can speak

Wraps PATCH /api/v2/conversations/calls/{conversationId}/participants/{participantId}/consult  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
ConsultTransferUpdate body = new ConsultTransferUpdate(); // ConsultTransferUpdate | new speak to
try {
    ConsultTransferResponse result = apiInstance.patchConversationsCallParticipantConsult(conversationId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCallParticipantConsult");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **body** | [**ConsultTransferUpdate**](ConsultTransferUpdate)| new speak to | 
{: class="table-striped"}


### Return type

[**ConsultTransferResponse**](ConsultTransferResponse)


# **patchConversationsCallback**


> [Conversation](Conversation) patchConversationsCallback(conversationId, body)

Update a conversation by disconnecting all of the participants

Wraps PATCH /api/v2/conversations/callbacks/{conversationId}  

Requires ANY permissions: 

* conversation:communication:disconnect

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
Conversation body = new Conversation(); // Conversation | Conversation
try {
    Conversation result = apiInstance.patchConversationsCallback(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCallback");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **body** | [**Conversation**](Conversation)| Conversation | 
{: class="table-striped"}


### Return type

[**Conversation**](Conversation)


# **patchConversationsCallbackParticipant**


> Void patchConversationsCallbackParticipant(conversationId, participantId, body)

Update conversation participant

Wraps PATCH /api/v2/conversations/callbacks/{conversationId}/participants/{participantId}  

Requires ANY permissions: 

* conversation:participant:wrapup
* conversation:call:record
* conversation:communication:disconnect

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Participant
try {
    apiInstance.patchConversationsCallbackParticipant(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCallbackParticipant");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **body** | [**MediaParticipantRequest**](MediaParticipantRequest)| Participant | 
{: class="table-striped"}


### Return type

null (empty response body)


# **patchConversationsCallbackParticipantAttributes**


> [ParticipantAttributes](ParticipantAttributes) patchConversationsCallbackParticipantAttributes(conversationId, participantId, body)

Update the attributes on a conversation participant.

Wraps PATCH /api/v2/conversations/callbacks/{conversationId}/participants/{participantId}/attributes  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
ParticipantAttributes body = new ParticipantAttributes(); // ParticipantAttributes | Attributes
try {
    ParticipantAttributes result = apiInstance.patchConversationsCallbackParticipantAttributes(conversationId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCallbackParticipantAttributes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **body** | [**ParticipantAttributes**](ParticipantAttributes)| Attributes | 
{: class="table-striped"}


### Return type

[**ParticipantAttributes**](ParticipantAttributes)


# **patchConversationsCallbackParticipantCommunication**


> Empty patchConversationsCallbackParticipantCommunication(conversationId, participantId, communicationId, body)

Update conversation participant's communication by disconnecting it.

Wraps PATCH /api/v2/conversations/callbacks/{conversationId}/participants/{participantId}/communications/{communicationId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Participant
try {
    Empty result = apiInstance.patchConversationsCallbackParticipantCommunication(conversationId, participantId, communicationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCallbackParticipantCommunication");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **communicationId** | **String**| communicationId | 
| **body** | [**MediaParticipantRequest**](MediaParticipantRequest)| Participant | 
{: class="table-striped"}


### Return type

**Empty**


# **patchConversationsCallbacks**


> [PatchCallbackResponse](PatchCallbackResponse) patchConversationsCallbacks(body)

Update a scheduled callback

Wraps PATCH /api/v2/conversations/callbacks  

Requires ANY permissions: 

* conversation:callback:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
PatchCallbackRequest body = new PatchCallbackRequest(); // PatchCallbackRequest | PatchCallbackRequest
try {
    PatchCallbackResponse result = apiInstance.patchConversationsCallbacks(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCallbacks");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**PatchCallbackRequest**](PatchCallbackRequest)| PatchCallbackRequest | 
{: class="table-striped"}


### Return type

[**PatchCallbackResponse**](PatchCallbackResponse)


# **patchConversationsChat**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [Conversation](Conversation) patchConversationsChat(conversationId, body)

Update a conversation by disconnecting all of the participants

This endpoint is deprecated. Please see the article https://help.genesys.cloud/articles/deprecation-removal-of-acd-web-chat-version-2/.

Wraps PATCH /api/v2/conversations/chats/{conversationId}  

Requires ANY permissions: 

* conversation:communication:disconnect

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
Conversation body = new Conversation(); // Conversation | Conversation
try {
    Conversation result = apiInstance.patchConversationsChat(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsChat");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **body** | [**Conversation**](Conversation)| Conversation | 
{: class="table-striped"}


### Return type

[**Conversation**](Conversation)


# **patchConversationsChatParticipant**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> Void patchConversationsChatParticipant(conversationId, participantId, body)

Update conversation participant

This endpoint is deprecated. Please see the article https://help.genesys.cloud/articles/deprecation-removal-of-acd-web-chat-version-2/.

Wraps PATCH /api/v2/conversations/chats/{conversationId}/participants/{participantId}  

Requires ANY permissions: 

* conversation:participant:wrapup
* conversation:call:record
* conversation:communication:disconnect

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Update request
try {
    apiInstance.patchConversationsChatParticipant(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsChatParticipant");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **body** | [**MediaParticipantRequest**](MediaParticipantRequest)| Update request | 
{: class="table-striped"}


### Return type

null (empty response body)


# **patchConversationsChatParticipantAttributes**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [ParticipantAttributes](ParticipantAttributes) patchConversationsChatParticipantAttributes(conversationId, participantId, body)

Update the attributes on a conversation participant.

This endpoint is deprecated. Please see the article https://help.genesys.cloud/articles/deprecation-removal-of-acd-web-chat-version-2/.

Wraps PATCH /api/v2/conversations/chats/{conversationId}/participants/{participantId}/attributes  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
ParticipantAttributes body = new ParticipantAttributes(); // ParticipantAttributes | Participant attributes
try {
    ParticipantAttributes result = apiInstance.patchConversationsChatParticipantAttributes(conversationId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsChatParticipantAttributes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **body** | [**ParticipantAttributes**](ParticipantAttributes)| Participant attributes | 
{: class="table-striped"}


### Return type

[**ParticipantAttributes**](ParticipantAttributes)


# **patchConversationsChatParticipantCommunication**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> Empty patchConversationsChatParticipantCommunication(conversationId, participantId, communicationId, body)

Update conversation participant's communication by disconnecting it. This endpoint does not update wrapup.

This endpoint is deprecated. Please see the article https://help.genesys.cloud/articles/deprecation-removal-of-acd-web-chat-version-2/.

Wraps PATCH /api/v2/conversations/chats/{conversationId}/participants/{participantId}/communications/{communicationId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Participant
try {
    Empty result = apiInstance.patchConversationsChatParticipantCommunication(conversationId, participantId, communicationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsChatParticipantCommunication");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **communicationId** | **String**| communicationId | 
| **body** | [**MediaParticipantRequest**](MediaParticipantRequest)| Participant | 
{: class="table-striped"}


### Return type

**Empty**


# **patchConversationsCobrowsesession**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [Conversation](Conversation) patchConversationsCobrowsesession(conversationId, body)

Update a conversation by disconnecting all of the participants

This endpoint is deprecated. Please see the article https://help.genesys.cloud/articles/deprecation-legacy-co-browse-and-screenshare/

Wraps PATCH /api/v2/conversations/cobrowsesessions/{conversationId}  

Requires ANY permissions: 

* conversation:communication:disconnect

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
Conversation body = new Conversation(); // Conversation | Conversation
try {
    Conversation result = apiInstance.patchConversationsCobrowsesession(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCobrowsesession");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **body** | [**Conversation**](Conversation)| Conversation | 
{: class="table-striped"}


### Return type

[**Conversation**](Conversation)


# **patchConversationsCobrowsesessionParticipant**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> Void patchConversationsCobrowsesessionParticipant(conversationId, participantId, body)

Update conversation participant

This endpoint is deprecated. Please see the article https://help.genesys.cloud/articles/deprecation-legacy-co-browse-and-screenshare/

Wraps PATCH /api/v2/conversations/cobrowsesessions/{conversationId}/participants/{participantId}  

Requires ANY permissions: 

* conversation:participant:wrapup
* conversation:call:record
* conversation:communication:disconnect

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | 
try {
    apiInstance.patchConversationsCobrowsesessionParticipant(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCobrowsesessionParticipant");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **body** | [**MediaParticipantRequest**](MediaParticipantRequest)|  | [optional] 
{: class="table-striped"}


### Return type

null (empty response body)


# **patchConversationsCobrowsesessionParticipantAttributes**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [ParticipantAttributes](ParticipantAttributes) patchConversationsCobrowsesessionParticipantAttributes(conversationId, participantId, body)

Update the attributes on a conversation participant.

This endpoint is deprecated. Please see the article https://help.genesys.cloud/articles/deprecation-legacy-co-browse-and-screenshare/

Wraps PATCH /api/v2/conversations/cobrowsesessions/{conversationId}/participants/{participantId}/attributes  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
ParticipantAttributes body = new ParticipantAttributes(); // ParticipantAttributes | 
try {
    ParticipantAttributes result = apiInstance.patchConversationsCobrowsesessionParticipantAttributes(conversationId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCobrowsesessionParticipantAttributes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **body** | [**ParticipantAttributes**](ParticipantAttributes)|  | [optional] 
{: class="table-striped"}


### Return type

[**ParticipantAttributes**](ParticipantAttributes)


# **patchConversationsCobrowsesessionParticipantCommunication**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> Empty patchConversationsCobrowsesessionParticipantCommunication(conversationId, participantId, communicationId, body)

Update conversation participant's communication by disconnecting it.

This endpoint is deprecated. Please see the article https://help.genesys.cloud/articles/deprecation-legacy-co-browse-and-screenshare/

Wraps PATCH /api/v2/conversations/cobrowsesessions/{conversationId}/participants/{participantId}/communications/{communicationId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Participant
try {
    Empty result = apiInstance.patchConversationsCobrowsesessionParticipantCommunication(conversationId, participantId, communicationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCobrowsesessionParticipantCommunication");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **communicationId** | **String**| communicationId | 
| **body** | [**MediaParticipantRequest**](MediaParticipantRequest)| Participant | 
{: class="table-striped"}


### Return type

**Empty**


# **patchConversationsEmail**


> [Conversation](Conversation) patchConversationsEmail(conversationId, body)

Update a conversation by disconnecting all of the participants

Wraps PATCH /api/v2/conversations/emails/{conversationId}  

Requires ANY permissions: 

* conversation:communication:disconnect

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
Conversation body = new Conversation(); // Conversation | Conversation
try {
    Conversation result = apiInstance.patchConversationsEmail(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsEmail");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **body** | [**Conversation**](Conversation)| Conversation | 
{: class="table-striped"}


### Return type

[**Conversation**](Conversation)


# **patchConversationsEmailMessagesDraft**


> [EmailMessage](EmailMessage) patchConversationsEmailMessagesDraft(conversationId, autoFill, discard, body)

Reset conversation draft to its initial state and/or auto-fill draft content

Wraps PATCH /api/v2/conversations/emails/{conversationId}/messages/draft  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
Boolean autoFill = true; // Boolean | autoFill
Boolean discard = true; // Boolean | discard
DraftManipulationRequest body = new DraftManipulationRequest(); // DraftManipulationRequest | Draft Manipulation Request
try {
    EmailMessage result = apiInstance.patchConversationsEmailMessagesDraft(conversationId, autoFill, discard, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsEmailMessagesDraft");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **autoFill** | **Boolean**| autoFill | [optional] 
| **discard** | **Boolean**| discard | [optional] 
| **body** | [**DraftManipulationRequest**](DraftManipulationRequest)| Draft Manipulation Request | [optional] 
{: class="table-striped"}


### Return type

[**EmailMessage**](EmailMessage)


# **patchConversationsEmailParticipant**


> Void patchConversationsEmailParticipant(conversationId, participantId, body)

Update conversation participant

Wraps PATCH /api/v2/conversations/emails/{conversationId}/participants/{participantId}  

Requires ANY permissions: 

* conversation:participant:wrapup
* conversation:call:record
* conversation:communication:disconnect
* conversation:email:park

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Update request
try {
    apiInstance.patchConversationsEmailParticipant(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsEmailParticipant");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **body** | [**MediaParticipantRequest**](MediaParticipantRequest)| Update request | 
{: class="table-striped"}


### Return type

null (empty response body)


# **patchConversationsEmailParticipantAttributes**


> [ParticipantAttributes](ParticipantAttributes) patchConversationsEmailParticipantAttributes(conversationId, participantId, body)

Update the attributes on a conversation participant.

Wraps PATCH /api/v2/conversations/emails/{conversationId}/participants/{participantId}/attributes  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
ParticipantAttributes body = new ParticipantAttributes(); // ParticipantAttributes | Participant attributes
try {
    ParticipantAttributes result = apiInstance.patchConversationsEmailParticipantAttributes(conversationId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsEmailParticipantAttributes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **body** | [**ParticipantAttributes**](ParticipantAttributes)| Participant attributes | 
{: class="table-striped"}


### Return type

[**ParticipantAttributes**](ParticipantAttributes)


# **patchConversationsEmailParticipantCommunication**


> Empty patchConversationsEmailParticipantCommunication(conversationId, participantId, communicationId, body)

Update conversation participant's communication by disconnecting it. This endpoint does not update wrapup.

Wraps PATCH /api/v2/conversations/emails/{conversationId}/participants/{participantId}/communications/{communicationId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Participant
try {
    Empty result = apiInstance.patchConversationsEmailParticipantCommunication(conversationId, participantId, communicationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsEmailParticipantCommunication");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **communicationId** | **String**| communicationId | 
| **body** | [**MediaParticipantRequest**](MediaParticipantRequest)| Participant | 
{: class="table-striped"}


### Return type

**Empty**


# **patchConversationsEmailParticipantParkingstate**


> Void patchConversationsEmailParticipantParkingstate(conversationId, participantId, body)

Update conversation by setting its parking state

Wraps PATCH /api/v2/conversations/emails/{conversationId}/participants/{participantId}/parkingstate  

Requires ANY permissions: 

* conversation:email:park

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
ParkingStateRequest body = new ParkingStateRequest(); // ParkingStateRequest | Parking update request
try {
    apiInstance.patchConversationsEmailParticipantParkingstate(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsEmailParticipantParkingstate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **body** | [**ParkingStateRequest**](ParkingStateRequest)| Parking update request | 
{: class="table-striped"}


### Return type

null (empty response body)


# **patchConversationsMessage**


> [Conversation](Conversation) patchConversationsMessage(conversationId, body)

Update a conversation by disconnecting all of the participants

Wraps PATCH /api/v2/conversations/messages/{conversationId}  

Requires ANY permissions: 

* conversation:communication:disconnect
* conversation:message:park

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
Conversation body = new Conversation(); // Conversation | Conversation
try {
    Conversation result = apiInstance.patchConversationsMessage(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsMessage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **body** | [**Conversation**](Conversation)| Conversation | 
{: class="table-striped"}


### Return type

[**Conversation**](Conversation)


# **patchConversationsMessageParticipant**


> Void patchConversationsMessageParticipant(conversationId, participantId, body)

Update conversation participant

Wraps PATCH /api/v2/conversations/messages/{conversationId}/participants/{participantId}  

Requires ANY permissions: 

* conversation:participant:wrapup
* conversation:call:record
* conversation:communication:disconnect

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | 
try {
    apiInstance.patchConversationsMessageParticipant(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsMessageParticipant");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **body** | [**MediaParticipantRequest**](MediaParticipantRequest)|  | [optional] 
{: class="table-striped"}


### Return type

null (empty response body)


# **patchConversationsMessageParticipantAttributes**


> [ParticipantAttributes](ParticipantAttributes) patchConversationsMessageParticipantAttributes(conversationId, participantId, body)

Update the attributes on a conversation participant.

Wraps PATCH /api/v2/conversations/messages/{conversationId}/participants/{participantId}/attributes  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
ParticipantAttributes body = new ParticipantAttributes(); // ParticipantAttributes | 
try {
    ParticipantAttributes result = apiInstance.patchConversationsMessageParticipantAttributes(conversationId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsMessageParticipantAttributes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **body** | [**ParticipantAttributes**](ParticipantAttributes)|  | [optional] 
{: class="table-striped"}


### Return type

[**ParticipantAttributes**](ParticipantAttributes)


# **patchConversationsMessageParticipantCommunication**


> Empty patchConversationsMessageParticipantCommunication(conversationId, participantId, communicationId, body)

Update conversation participant's communication by disconnecting it. This endpoint does not update wrapup.

Wraps PATCH /api/v2/conversations/messages/{conversationId}/participants/{participantId}/communications/{communicationId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Participant
try {
    Empty result = apiInstance.patchConversationsMessageParticipantCommunication(conversationId, participantId, communicationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsMessageParticipantCommunication");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **communicationId** | **String**| communicationId | 
| **body** | [**MediaParticipantRequest**](MediaParticipantRequest)| Participant | 
{: class="table-striped"}


### Return type

**Empty**


# **patchConversationsMessagingIntegrationsAppleIntegrationId**


> [AppleIntegration](AppleIntegration) patchConversationsMessagingIntegrationsAppleIntegrationId(integrationId, body)

Update an Apple messaging integration

Wraps PATCH /api/v2/conversations/messaging/integrations/apple/{integrationId}  

Requires ALL permissions: 

* messaging:appleIntegration:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
AppleIntegrationUpdateRequest body = new AppleIntegrationUpdateRequest(); // AppleIntegrationUpdateRequest | AppleIntegrationUpdateRequest
try {
    AppleIntegration result = apiInstance.patchConversationsMessagingIntegrationsAppleIntegrationId(integrationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsMessagingIntegrationsAppleIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
| **body** | [**AppleIntegrationUpdateRequest**](AppleIntegrationUpdateRequest)| AppleIntegrationUpdateRequest | 
{: class="table-striped"}


### Return type

[**AppleIntegration**](AppleIntegration)


# **patchConversationsMessagingIntegrationsFacebookIntegrationId**


> [FacebookIntegration](FacebookIntegration) patchConversationsMessagingIntegrationsFacebookIntegrationId(integrationId, body)

Update Facebook messaging integration

Wraps PATCH /api/v2/conversations/messaging/integrations/facebook/{integrationId}  

Requires ALL permissions: 

* messaging:integration:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
FacebookIntegrationUpdateRequest body = new FacebookIntegrationUpdateRequest(); // FacebookIntegrationUpdateRequest | FacebookIntegrationUpdateRequest
try {
    FacebookIntegration result = apiInstance.patchConversationsMessagingIntegrationsFacebookIntegrationId(integrationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsMessagingIntegrationsFacebookIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
| **body** | [**FacebookIntegrationUpdateRequest**](FacebookIntegrationUpdateRequest)| FacebookIntegrationUpdateRequest | 
{: class="table-striped"}


### Return type

[**FacebookIntegration**](FacebookIntegration)


# **patchConversationsMessagingIntegrationsInstagramIntegrationId**


> [InstagramIntegration](InstagramIntegration) patchConversationsMessagingIntegrationsInstagramIntegrationId(integrationId, body)

Update Instagram messaging integration

Wraps PATCH /api/v2/conversations/messaging/integrations/instagram/{integrationId}  

Requires ALL permissions: 

* messaging:integration:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
InstagramIntegrationUpdateRequest body = new InstagramIntegrationUpdateRequest(); // InstagramIntegrationUpdateRequest | InstagramIntegrationUpdateRequest
try {
    InstagramIntegration result = apiInstance.patchConversationsMessagingIntegrationsInstagramIntegrationId(integrationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsMessagingIntegrationsInstagramIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
| **body** | [**InstagramIntegrationUpdateRequest**](InstagramIntegrationUpdateRequest)| InstagramIntegrationUpdateRequest | 
{: class="table-striped"}


### Return type

[**InstagramIntegration**](InstagramIntegration)


# **patchConversationsMessagingIntegrationsOpenIntegrationId**


> [OpenIntegration](OpenIntegration) patchConversationsMessagingIntegrationsOpenIntegrationId(integrationId, body)

Update an Open messaging integration

See https://developer.genesys.cloud/api/digital/openmessaging/ for more information.

Wraps PATCH /api/v2/conversations/messaging/integrations/open/{integrationId}  

Requires ALL permissions: 

* messaging:integration:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
OpenIntegrationUpdateRequest body = new OpenIntegrationUpdateRequest(); // OpenIntegrationUpdateRequest | OpenIntegrationUpdateRequest
try {
    OpenIntegration result = apiInstance.patchConversationsMessagingIntegrationsOpenIntegrationId(integrationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsMessagingIntegrationsOpenIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
| **body** | [**OpenIntegrationUpdateRequest**](OpenIntegrationUpdateRequest)| OpenIntegrationUpdateRequest | 
{: class="table-striped"}


### Return type

[**OpenIntegration**](OpenIntegration)


# **patchConversationsMessagingIntegrationsTwitterIntegrationId**


> [TwitterIntegration](TwitterIntegration) patchConversationsMessagingIntegrationsTwitterIntegrationId(integrationId, body)

Update a Twitter messaging integration

Wraps PATCH /api/v2/conversations/messaging/integrations/twitter/{integrationId}  

Requires ALL permissions: 

* messaging:XIntegration:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
TwitterIntegrationUpdateRequest body = new TwitterIntegrationUpdateRequest(); // TwitterIntegrationUpdateRequest | TwitterIntegrationUpdateRequest
try {
    TwitterIntegration result = apiInstance.patchConversationsMessagingIntegrationsTwitterIntegrationId(integrationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsMessagingIntegrationsTwitterIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
| **body** | [**TwitterIntegrationUpdateRequest**](TwitterIntegrationUpdateRequest)| TwitterIntegrationUpdateRequest | 
{: class="table-striped"}


### Return type

[**TwitterIntegration**](TwitterIntegration)


# **patchConversationsMessagingIntegrationsWhatsappEmbeddedsignupIntegrationId**


> [WhatsAppIntegration](WhatsAppIntegration) patchConversationsMessagingIntegrationsWhatsappEmbeddedsignupIntegrationId(integrationId, body)

Activate a WhatsApp messaging integration created using the WhatsApp embedded signup flow

Please specify the phone number to associate with this WhatsApp integration from the list of available phone numbers returned to you in the GET call on the integration with a createStatus of Completed. You can then run a GET on the integration to check if its status has been updated to Active.

Wraps PATCH /api/v2/conversations/messaging/integrations/whatsapp/embeddedsignup/{integrationId}  

Requires ALL permissions: 

* messaging:integration:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
WhatsAppEmbeddedSignupIntegrationActivationRequest body = new WhatsAppEmbeddedSignupIntegrationActivationRequest(); // WhatsAppEmbeddedSignupIntegrationActivationRequest | WhatsAppEmbeddedSignupIntegrationActivationRequest
try {
    WhatsAppIntegration result = apiInstance.patchConversationsMessagingIntegrationsWhatsappEmbeddedsignupIntegrationId(integrationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsMessagingIntegrationsWhatsappEmbeddedsignupIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
| **body** | [**WhatsAppEmbeddedSignupIntegrationActivationRequest**](WhatsAppEmbeddedSignupIntegrationActivationRequest)| WhatsAppEmbeddedSignupIntegrationActivationRequest | 
{: class="table-striped"}


### Return type

[**WhatsAppIntegration**](WhatsAppIntegration)


# **patchConversationsMessagingIntegrationsWhatsappIntegrationId**


> [WhatsAppIntegration](WhatsAppIntegration) patchConversationsMessagingIntegrationsWhatsappIntegrationId(integrationId, body)

Update a WhatsApp messaging integration

Wraps PATCH /api/v2/conversations/messaging/integrations/whatsapp/{integrationId}  

Requires ALL permissions: 

* messaging:integration:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
WhatsAppIntegrationUpdateRequest body = new WhatsAppIntegrationUpdateRequest(); // WhatsAppIntegrationUpdateRequest | WhatsAppIntegrationUpdateRequest
try {
    WhatsAppIntegration result = apiInstance.patchConversationsMessagingIntegrationsWhatsappIntegrationId(integrationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsMessagingIntegrationsWhatsappIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
| **body** | [**WhatsAppIntegrationUpdateRequest**](WhatsAppIntegrationUpdateRequest)| WhatsAppIntegrationUpdateRequest | 
{: class="table-striped"}


### Return type

[**WhatsAppIntegration**](WhatsAppIntegration)


# **patchConversationsMessagingSetting**


> [MessagingSetting](MessagingSetting) patchConversationsMessagingSetting(messageSettingId, body)

Update a messaging setting

Wraps PATCH /api/v2/conversations/messaging/settings/{messageSettingId}  

Requires ALL permissions: 

* messaging:setting:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String messageSettingId = "messageSettingId_example"; // String | Message Setting ID
MessagingSettingPatchRequest body = new MessagingSettingPatchRequest(); // MessagingSettingPatchRequest | MessagingSetting
try {
    MessagingSetting result = apiInstance.patchConversationsMessagingSetting(messageSettingId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsMessagingSetting");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **messageSettingId** | **String**| Message Setting ID | 
| **body** | [**MessagingSettingPatchRequest**](MessagingSettingPatchRequest)| MessagingSetting | 
{: class="table-striped"}


### Return type

[**MessagingSetting**](MessagingSetting)


# **patchConversationsMessagingSupportedcontentSupportedContentId**


> [SupportedContent](SupportedContent) patchConversationsMessagingSupportedcontentSupportedContentId(supportedContentId, body)

Update a supported content profile

Wraps PATCH /api/v2/conversations/messaging/supportedcontent/{supportedContentId}  

Requires ALL permissions: 

* messaging:supportedContent:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String supportedContentId = "supportedContentId_example"; // String | Supported Content ID
SupportedContent body = new SupportedContent(); // SupportedContent | SupportedContent
try {
    SupportedContent result = apiInstance.patchConversationsMessagingSupportedcontentSupportedContentId(supportedContentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsMessagingSupportedcontentSupportedContentId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **supportedContentId** | **String**| Supported Content ID | 
| **body** | [**SupportedContent**](SupportedContent)| SupportedContent | 
{: class="table-striped"}


### Return type

[**SupportedContent**](SupportedContent)


# **patchConversationsSettings**


> Void patchConversationsSettings(body)

Update Settings

Wraps PATCH /api/v2/conversations/settings  

Requires ANY permissions: 

* conversation:settings:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
Settings body = new Settings(); // Settings | Settings
try {
    apiInstance.patchConversationsSettings(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**Settings**](Settings)| Settings | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postAnalyticsConversationDetailsProperties**


> [PropertyIndexRequest](PropertyIndexRequest) postAnalyticsConversationDetailsProperties(conversationId, body)

Index conversation properties

Wraps POST /api/v2/analytics/conversations/{conversationId}/details/properties  

Requires ANY permissions: 

* analytics:conversationProperties:index

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
PropertyIndexRequest body = new PropertyIndexRequest(); // PropertyIndexRequest | request
try {
    PropertyIndexRequest result = apiInstance.postAnalyticsConversationDetailsProperties(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postAnalyticsConversationDetailsProperties");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **body** | [**PropertyIndexRequest**](PropertyIndexRequest)| request | 
{: class="table-striped"}


### Return type

[**PropertyIndexRequest**](PropertyIndexRequest)


# **postAnalyticsConversationsActivityQuery**


> [ConversationActivityResponse](ConversationActivityResponse) postAnalyticsConversationsActivityQuery(body, pageSize, pageNumber)

Query for conversation activity observations

Wraps POST /api/v2/analytics/conversations/activity/query  

Requires ANY permissions: 

* analytics:queueObservation:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
ConversationActivityQuery body = new ConversationActivityQuery(); // ConversationActivityQuery | query
Integer pageSize = 56; // Integer | The desired page size
Integer pageNumber = 56; // Integer | The desired page number
try {
    ConversationActivityResponse result = apiInstance.postAnalyticsConversationsActivityQuery(body, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postAnalyticsConversationsActivityQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ConversationActivityQuery**](ConversationActivityQuery)| query | 
| **pageSize** | **Integer**| The desired page size | [optional] 
| **pageNumber** | **Integer**| The desired page number | [optional] 
{: class="table-striped"}


### Return type

[**ConversationActivityResponse**](ConversationActivityResponse)


# **postAnalyticsConversationsAggregatesJobs**


> [AsyncQueryResponse](AsyncQueryResponse) postAnalyticsConversationsAggregatesJobs(body)

Query for conversation aggregates asynchronously

postAnalyticsConversationsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/analytics/conversations/aggregates/jobs  

Requires ANY permissions: 

* analytics:conversationAggregate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
ConversationAsyncAggregationQuery body = new ConversationAsyncAggregationQuery(); // ConversationAsyncAggregationQuery | query
try {
    AsyncQueryResponse result = apiInstance.postAnalyticsConversationsAggregatesJobs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postAnalyticsConversationsAggregatesJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ConversationAsyncAggregationQuery**](ConversationAsyncAggregationQuery)| query | 
{: class="table-striped"}


### Return type

[**AsyncQueryResponse**](AsyncQueryResponse)


# **postAnalyticsConversationsAggregatesQuery**


> [ConversationAggregateQueryResponse](ConversationAggregateQueryResponse) postAnalyticsConversationsAggregatesQuery(body)

Query for conversation aggregates

Wraps POST /api/v2/analytics/conversations/aggregates/query  

Requires ANY permissions: 

* analytics:conversationAggregate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
ConversationAggregationQuery body = new ConversationAggregationQuery(); // ConversationAggregationQuery | query
try {
    ConversationAggregateQueryResponse result = apiInstance.postAnalyticsConversationsAggregatesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postAnalyticsConversationsAggregatesQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ConversationAggregationQuery**](ConversationAggregationQuery)| query | 
{: class="table-striped"}


### Return type

[**ConversationAggregateQueryResponse**](ConversationAggregateQueryResponse)


# **postAnalyticsConversationsDetailsJobs**


> [AsyncQueryResponse](AsyncQueryResponse) postAnalyticsConversationsDetailsJobs(body)

Query for conversation details asynchronously

Wraps POST /api/v2/analytics/conversations/details/jobs  

Requires ANY permissions: 

* analytics:conversationDetail:view
* analytics:agentConversationDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
AsyncConversationQuery body = new AsyncConversationQuery(); // AsyncConversationQuery | query
try {
    AsyncQueryResponse result = apiInstance.postAnalyticsConversationsDetailsJobs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postAnalyticsConversationsDetailsJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**AsyncConversationQuery**](AsyncConversationQuery)| query | 
{: class="table-striped"}


### Return type

[**AsyncQueryResponse**](AsyncQueryResponse)


# **postAnalyticsConversationsDetailsQuery**


> [AnalyticsConversationQueryResponse](AnalyticsConversationQueryResponse) postAnalyticsConversationsDetailsQuery(body)

Query for conversation details

Wraps POST /api/v2/analytics/conversations/details/query  

Requires ANY permissions: 

* analytics:conversationDetail:view
* analytics:agentConversationDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
ConversationQuery body = new ConversationQuery(); // ConversationQuery | query
try {
    AnalyticsConversationQueryResponse result = apiInstance.postAnalyticsConversationsDetailsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postAnalyticsConversationsDetailsQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ConversationQuery**](ConversationQuery)| query | 
{: class="table-striped"}


### Return type

[**AnalyticsConversationQueryResponse**](AnalyticsConversationQueryResponse)


# **postConversationAssign**


> String postConversationAssign(conversationId, body)

Attempts to manually assign a specified conversation to a specified user.  Ignores bullseye ring, PAR score, skills, and languages.

Wraps POST /api/v2/conversations/{conversationId}/assign  

Requires ANY permissions: 

* conversation:call:pull
* conversation:call:assign
* conversation:callback:pull
* conversation:callback:assign
* conversation:webchat:pull
* conversation:webchat:assign
* conversation:email:pull
* conversation:email:assign
* conversation:message:pull
* conversation:message:assign

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
ConversationUser body = new ConversationUser(); // ConversationUser | Targeted user
try {
    String result = apiInstance.postConversationAssign(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationAssign");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | 
| **body** | [**ConversationUser**](ConversationUser)| Targeted user | 
{: class="table-striped"}


### Return type

**String**


# **postConversationBarge**


> Void postConversationBarge(conversationId)

Barge a conversation creating a barged in conference of connected participants.

Wraps POST /api/v2/conversations/{conversationId}/barge  

Requires ANY permissions: 

* conversation:call:barge

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
try {
    apiInstance.postConversationBarge(conversationId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationBarge");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postConversationCobrowse**


> [CobrowseWebMessagingSession](CobrowseWebMessagingSession) postConversationCobrowse(conversationId)

Creates a cobrowse session. Requires \"conversation:cobrowse:add\" (for web messaging) or \"conversation:cobrowsevoice:add\" permission.

Wraps POST /api/v2/conversations/{conversationId}/cobrowse  

Requires ANY permissions: 

* conversation:cobrowse:add
* conversation:cobrowseVoice:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | Conversation ID
try {
    CobrowseWebMessagingSession result = apiInstance.postConversationCobrowse(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationCobrowse");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| Conversation ID | 
{: class="table-striped"}


### Return type

[**CobrowseWebMessagingSession**](CobrowseWebMessagingSession)


# **postConversationCommunicationInternalmessages**


> [InternalMessageData](InternalMessageData) postConversationCommunicationInternalmessages(conversationId, communicationId, body)

Send internal message

Send a new internal message for an existing communication.

postConversationCommunicationInternalmessages is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/conversations/{conversationId}/communications/{communicationId}/internalmessages  

Requires ANY permissions: 

* conversation:internalMessaging:create

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String communicationId = "communicationId_example"; // String | communicationId
InternalMessageRequest body = new InternalMessageRequest(); // InternalMessageRequest | Message
try {
    InternalMessageData result = apiInstance.postConversationCommunicationInternalmessages(conversationId, communicationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationCommunicationInternalmessages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **communicationId** | **String**| communicationId | 
| **body** | [**InternalMessageRequest**](InternalMessageRequest)| Message | 
{: class="table-striped"}


### Return type

[**InternalMessageData**](InternalMessageData)


# **postConversationDisconnect**


> String postConversationDisconnect(conversationId)

Performs a full conversation teardown. Issues disconnect requests for any connected media. Applies a system wrap-up code to any participants that are pending wrap-up. This is not intended to be the normal way of ending interactions but is available in the event of problems with the application to allow a resynchronization of state across all components. It is recommended that users submit a support case if they are relying on this endpoint systematically as there is likely something that needs investigation.

Wraps POST /api/v2/conversations/{conversationId}/disconnect  

Requires ANY permissions: 

* conversation:communication:disconnect

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
try {
    String result = apiInstance.postConversationDisconnect(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationDisconnect");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | 
{: class="table-striped"}


### Return type

**String**


# **postConversationParticipantCallbacks**


> Void postConversationParticipantCallbacks(conversationId, participantId, body)

Create a new callback for the specified participant on the conversation.

Wraps POST /api/v2/conversations/{conversationId}/participants/{participantId}/callbacks  

Requires ALL permissions: 

* conversation:callback:create

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
CreateCallbackOnConversationCommand body = new CreateCallbackOnConversationCommand(); // CreateCallbackOnConversationCommand | 
try {
    apiInstance.postConversationParticipantCallbacks(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationParticipantCallbacks");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | 
| **participantId** | **String**| participant ID | 
| **body** | [**CreateCallbackOnConversationCommand**](CreateCallbackOnConversationCommand)|  | [optional] 
{: class="table-striped"}


### Return type

null (empty response body)


# **postConversationParticipantDigits**


> Void postConversationParticipantDigits(conversationId, participantId, body)

Sends DTMF to the participant

Wraps POST /api/v2/conversations/{conversationId}/participants/{participantId}/digits  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
Digits body = new Digits(); // Digits | Digits
try {
    apiInstance.postConversationParticipantDigits(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationParticipantDigits");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | 
| **participantId** | **String**| participant ID | 
| **body** | [**Digits**](Digits)| Digits | [optional] 
{: class="table-striped"}


### Return type

null (empty response body)


# **postConversationParticipantInternalmessagesUsersCommunications**


> [MessagingConferResponse](MessagingConferResponse) postConversationParticipantInternalmessagesUsersCommunications(conversationId, participantId, body)

Setup internal message communication with user

The target user of the digital consultation must have the `conversation:internalMessaging:accept` permission.

postConversationParticipantInternalmessagesUsersCommunications is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/conversations/{conversationId}/participants/{participantId}/internalmessages/users/communications  

Requires ANY permissions: 

* conversation:internalMessaging:setupWithUser

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
MessagingConferWithUserRequest body = new MessagingConferWithUserRequest(); // MessagingConferWithUserRequest | Confer request
try {
    MessagingConferResponse result = apiInstance.postConversationParticipantInternalmessagesUsersCommunications(conversationId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationParticipantInternalmessagesUsersCommunications");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | 
| **participantId** | **String**| participant ID | 
| **body** | [**MessagingConferWithUserRequest**](MessagingConferWithUserRequest)| Confer request | 
{: class="table-striped"}


### Return type

[**MessagingConferResponse**](MessagingConferResponse)


# **postConversationParticipantReplace**


> Void postConversationParticipantReplace(conversationId, participantId, body)

Replace this participant with the specified user and/or address

Wraps POST /api/v2/conversations/{conversationId}/participants/{participantId}/replace  

Requires ANY permissions: 

* conversation:communication:blindTransfer

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
TransferRequest body = new TransferRequest(); // TransferRequest | Transfer request
try {
    apiInstance.postConversationParticipantReplace(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationParticipantReplace");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | 
| **participantId** | **String**| participant ID | 
| **body** | [**TransferRequest**](TransferRequest)| Transfer request | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postConversationParticipantReplaceAgent**


> Void postConversationParticipantReplaceAgent(conversationId, participantId, body)

Replace this participant with the specified agent

Wraps POST /api/v2/conversations/{conversationId}/participants/{participantId}/replace/agent  

Requires ANY permissions: 

* conversation:communication:blindTransfer
* conversation:communication:blindTransferAgent

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
TransferToAgentRequest body = new TransferToAgentRequest(); // TransferToAgentRequest | Transfer request
try {
    apiInstance.postConversationParticipantReplaceAgent(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationParticipantReplaceAgent");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | 
| **participantId** | **String**| participant ID | 
| **body** | [**TransferToAgentRequest**](TransferToAgentRequest)| Transfer request | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postConversationParticipantReplaceContactExternal**


> Void postConversationParticipantReplaceContactExternal(conversationId, participantId, body)

Replace this participant with the an external contact

postConversationParticipantReplaceContactExternal is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/conversations/{conversationId}/participants/{participantId}/replace/contact/external  

Requires ANY permissions: 

* conversation:communication:blindTransfer
* conversation:communication:blindTransferExternalContact

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
TransferToExternalContactRequest body = new TransferToExternalContactRequest(); // TransferToExternalContactRequest | Transfer request
try {
    apiInstance.postConversationParticipantReplaceContactExternal(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationParticipantReplaceContactExternal");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | 
| **participantId** | **String**| participant ID | 
| **body** | [**TransferToExternalContactRequest**](TransferToExternalContactRequest)| Transfer request | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postConversationParticipantReplaceExternal**


> Void postConversationParticipantReplaceExternal(conversationId, participantId, body)

Replace this participant with the an external contact

Wraps POST /api/v2/conversations/{conversationId}/participants/{participantId}/replace/external  

Requires ANY permissions: 

* conversation:communication:blindTransfer
* conversation:communication:blindTransferExternal

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
TransferToExternalRequest body = new TransferToExternalRequest(); // TransferToExternalRequest | Transfer request
try {
    apiInstance.postConversationParticipantReplaceExternal(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationParticipantReplaceExternal");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | 
| **participantId** | **String**| participant ID | 
| **body** | [**TransferToExternalRequest**](TransferToExternalRequest)| Transfer request | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postConversationParticipantReplaceQueue**


> Void postConversationParticipantReplaceQueue(conversationId, participantId, body)

Replace this participant with the specified queue

Wraps POST /api/v2/conversations/{conversationId}/participants/{participantId}/replace/queue  

Requires ANY permissions: 

* conversation:communication:blindTransfer
* conversation:communication:blindTransferQueue

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
TransferToQueueRequest body = new TransferToQueueRequest(); // TransferToQueueRequest | Transfer request
try {
    apiInstance.postConversationParticipantReplaceQueue(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationParticipantReplaceQueue");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | 
| **participantId** | **String**| participant ID | 
| **body** | [**TransferToQueueRequest**](TransferToQueueRequest)| Transfer request | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postConversationParticipantSecureivrsessions**


> [SecureSession](SecureSession) postConversationParticipantSecureivrsessions(conversationId, participantId, body)

Create secure IVR session. Only a participant in the conversation can invoke a secure IVR.

Wraps POST /api/v2/conversations/{conversationId}/participants/{participantId}/secureivrsessions  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
CreateSecureSession body = new CreateSecureSession(); // CreateSecureSession | 
try {
    SecureSession result = apiInstance.postConversationParticipantSecureivrsessions(conversationId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationParticipantSecureivrsessions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | 
| **participantId** | **String**| participant ID | 
| **body** | [**CreateSecureSession**](CreateSecureSession)|  | [optional] 
{: class="table-striped"}


### Return type

[**SecureSession**](SecureSession)


# **postConversationParticipantTransfer**


> Void postConversationParticipantTransfer(conversationId, participantId, body)

Replace this participant by another one using the address of the destination.

postConversationParticipantTransfer is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/conversations/{conversationId}/participants/{participantId}/transfer  

Requires ANY permissions: 

* conversation:communication:blindTransfer

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
TransferToAddressRequest body = new TransferToAddressRequest(); // TransferToAddressRequest | Transfer request
try {
    apiInstance.postConversationParticipantTransfer(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationParticipantTransfer");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | 
| **participantId** | **String**| participant ID | 
| **body** | [**TransferToAddressRequest**](TransferToAddressRequest)| Transfer request | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postConversationSuggestionEngagement**


> [SuggestionEngagement](SuggestionEngagement) postConversationSuggestionEngagement(conversationId, suggestionId, body)

Save an engagement on the suggestion.

Wraps POST /api/v2/conversations/{conversationId}/suggestions/{suggestionId}/engagement  

Requires ALL permissions: 

* conversation:suggestionEngagement:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String suggestionId = "suggestionId_example"; // String | Suggestion ID
SuggestionEngagement body = new SuggestionEngagement(); // SuggestionEngagement | 
try {
    SuggestionEngagement result = apiInstance.postConversationSuggestionEngagement(conversationId, suggestionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationSuggestionEngagement");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| Conversation ID | 
| **suggestionId** | **String**| Suggestion ID | 
| **body** | [**SuggestionEngagement**](SuggestionEngagement)|  | 
{: class="table-striped"}


### Return type

[**SuggestionEngagement**](SuggestionEngagement)


# **postConversationSuggestionsFeedback**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> Void postConversationSuggestionsFeedback(conversationId, body)

Suggestion feedback.

Google Agent Assist offering within Genesys will no longer be supported

Wraps POST /api/v2/conversations/{conversationId}/suggestions/feedback  

Requires ANY permissions: 

* conversation:suggestionFeedback:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | Conversation ID
Feedback body = new Feedback(); // Feedback | SuggestionFeedback
try {
    apiInstance.postConversationSuggestionsFeedback(conversationId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationSuggestionsFeedback");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| Conversation ID | 
| **body** | [**Feedback**](Feedback)| SuggestionFeedback | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postConversationSummaryFeedback**


> Void postConversationSummaryFeedback(conversationId, summaryId, body)

Submit feedback for the summary.

Wraps POST /api/v2/conversations/{conversationId}/summaries/{summaryId}/feedback  

Requires ALL permissions: 

* conversation:summaryFeedback:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String summaryId = "summaryId_example"; // String | Summary ID
FeedbackAddRequest body = new FeedbackAddRequest(); // FeedbackAddRequest | 
try {
    apiInstance.postConversationSummaryFeedback(conversationId, summaryId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationSummaryFeedback");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| Conversation ID | 
| **summaryId** | **String**| Summary ID | 
| **body** | [**FeedbackAddRequest**](FeedbackAddRequest)|  | [optional] 
{: class="table-striped"}


### Return type

null (empty response body)


# **postConversationsCall**


> [Conversation](Conversation) postConversationsCall(conversationId, body)

Place a new call as part of a callback conversation.

Wraps POST /api/v2/conversations/calls/{conversationId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
CallCommand body = new CallCommand(); // CallCommand | Conversation
try {
    Conversation result = apiInstance.postConversationsCall(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCall");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **body** | [**CallCommand**](CallCommand)| Conversation | 
{: class="table-striped"}


### Return type

[**Conversation**](Conversation)


# **postConversationsCallParticipantBarge**


> Void postConversationsCallParticipantBarge(conversationId, participantId)

Barge a given participant's call creating a barged in conference of connected participants.

Wraps POST /api/v2/conversations/calls/{conversationId}/participants/{participantId}/barge  

Requires ANY permissions: 

* conversation:call:barge

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
try {
    apiInstance.postConversationsCallParticipantBarge(conversationId, participantId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCallParticipantBarge");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postConversationsCallParticipantCoach**


> Void postConversationsCallParticipantCoach(conversationId, participantId)

Listen in on the conversation from the point of view of a given participant while speaking to just the given participant.

Wraps POST /api/v2/conversations/calls/{conversationId}/participants/{participantId}/coach  

Requires ANY permissions: 

* conversation:call:coach

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
try {
    apiInstance.postConversationsCallParticipantCoach(conversationId, participantId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCallParticipantCoach");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postConversationsCallParticipantCommunicationWrapup**


> Void postConversationsCallParticipantCommunicationWrapup(conversationId, participantId, communicationId, body)

Apply wrap-up for this conversation communication

Wraps POST /api/v2/conversations/calls/{conversationId}/participants/{participantId}/communications/{communicationId}/wrapup  

Requires ANY permissions: 

* conversation:participant:wrapup

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
WrapupInput body = new WrapupInput(); // WrapupInput | Wrap-up
try {
    apiInstance.postConversationsCallParticipantCommunicationWrapup(conversationId, participantId, communicationId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCallParticipantCommunicationWrapup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **communicationId** | **String**| communicationId | 
| **body** | [**WrapupInput**](WrapupInput)| Wrap-up | [optional] 
{: class="table-striped"}


### Return type

null (empty response body)


# **postConversationsCallParticipantConsult**


> [ConsultTransferResponse](ConsultTransferResponse) postConversationsCallParticipantConsult(conversationId, participantId, body)

Initiate and update consult transfer

Wraps POST /api/v2/conversations/calls/{conversationId}/participants/{participantId}/consult  

Requires ANY permissions: 

* conversation:communication:consultTransfer

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
ConsultTransfer body = new ConsultTransfer(); // ConsultTransfer | Destination address & initial speak to
try {
    ConsultTransferResponse result = apiInstance.postConversationsCallParticipantConsult(conversationId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCallParticipantConsult");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **body** | [**ConsultTransfer**](ConsultTransfer)| Destination address &amp; initial speak to | 
{: class="table-striped"}


### Return type

[**ConsultTransferResponse**](ConsultTransferResponse)


# **postConversationsCallParticipantConsultAgent**


> [ConsultTransferResponse](ConsultTransferResponse) postConversationsCallParticipantConsultAgent(conversationId, participantId, body)

Initiate a consult transfer to an agent

Wraps POST /api/v2/conversations/calls/{conversationId}/participants/{participantId}/consult/agent  

Requires ANY permissions: 

* conversation:communication:consultTransfer
* conversation:communication:consultTransferAgent

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
ConsultTransferToAgent body = new ConsultTransferToAgent(); // ConsultTransferToAgent | Destination agent & initial speak to
try {
    ConsultTransferResponse result = apiInstance.postConversationsCallParticipantConsultAgent(conversationId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCallParticipantConsultAgent");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **body** | [**ConsultTransferToAgent**](ConsultTransferToAgent)| Destination agent &amp; initial speak to | 
{: class="table-striped"}


### Return type

[**ConsultTransferResponse**](ConsultTransferResponse)


# **postConversationsCallParticipantConsultContactExternal**


> [ConsultTransferResponse](ConsultTransferResponse) postConversationsCallParticipantConsultContactExternal(conversationId, participantId, body)

Initiate a consult transfer to an external contact

postConversationsCallParticipantConsultContactExternal is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/conversations/calls/{conversationId}/participants/{participantId}/consult/contact/external  

Requires ANY permissions: 

* conversation:communication:consultTransfer
* conversation:communication:consultTransferExternalContact

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
ConsultTransferToExternalContact body = new ConsultTransferToExternalContact(); // ConsultTransferToExternalContact | Destination address & initial speak to
try {
    ConsultTransferResponse result = apiInstance.postConversationsCallParticipantConsultContactExternal(conversationId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCallParticipantConsultContactExternal");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **body** | [**ConsultTransferToExternalContact**](ConsultTransferToExternalContact)| Destination address &amp; initial speak to | 
{: class="table-striped"}


### Return type

[**ConsultTransferResponse**](ConsultTransferResponse)


# **postConversationsCallParticipantConsultExternal**


> [ConsultTransferResponse](ConsultTransferResponse) postConversationsCallParticipantConsultExternal(conversationId, participantId, body)

Initiate a consult transfer to an external contact

Wraps POST /api/v2/conversations/calls/{conversationId}/participants/{participantId}/consult/external  

Requires ANY permissions: 

* conversation:communication:consultTransfer
* conversation:communication:consultTransferExternal

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
ConsultTransferToExternal body = new ConsultTransferToExternal(); // ConsultTransferToExternal | Destination address & initial speak to
try {
    ConsultTransferResponse result = apiInstance.postConversationsCallParticipantConsultExternal(conversationId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCallParticipantConsultExternal");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **body** | [**ConsultTransferToExternal**](ConsultTransferToExternal)| Destination address &amp; initial speak to | 
{: class="table-striped"}


### Return type

[**ConsultTransferResponse**](ConsultTransferResponse)


# **postConversationsCallParticipantConsultQueue**


> [ConsultTransferResponse](ConsultTransferResponse) postConversationsCallParticipantConsultQueue(conversationId, participantId, body)

Initiate a consult transfer to a queue

Wraps POST /api/v2/conversations/calls/{conversationId}/participants/{participantId}/consult/queue  

Requires ANY permissions: 

* conversation:communication:consultTransfer
* conversation:communication:consultTransferQueue

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
ConsultTransferToQueue body = new ConsultTransferToQueue(); // ConsultTransferToQueue | Destination queue & initial speak to
try {
    ConsultTransferResponse result = apiInstance.postConversationsCallParticipantConsultQueue(conversationId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCallParticipantConsultQueue");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **body** | [**ConsultTransferToQueue**](ConsultTransferToQueue)| Destination queue &amp; initial speak to | 
{: class="table-striped"}


### Return type

[**ConsultTransferResponse**](ConsultTransferResponse)


# **postConversationsCallParticipantMonitor**


> Void postConversationsCallParticipantMonitor(conversationId, participantId)

Listen in on the conversation from the point of view of a given participant.

Wraps POST /api/v2/conversations/calls/{conversationId}/participants/{participantId}/monitor  

Requires ANY permissions: 

* conversation:call:monitor

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
try {
    apiInstance.postConversationsCallParticipantMonitor(conversationId, participantId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCallParticipantMonitor");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postConversationsCallParticipantReplace**


> Void postConversationsCallParticipantReplace(conversationId, participantId, body)

Replace this participant with the specified user and/or address

Wraps POST /api/v2/conversations/calls/{conversationId}/participants/{participantId}/replace  

Requires ANY permissions: 

* conversation:communication:blindTransfer

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
TransferRequest body = new TransferRequest(); // TransferRequest | Transfer request
try {
    apiInstance.postConversationsCallParticipantReplace(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCallParticipantReplace");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **body** | [**TransferRequest**](TransferRequest)| Transfer request | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postConversationsCallParticipantVoiceConsult**


> [ConsultTransferResponse](ConsultTransferResponse) postConversationsCallParticipantVoiceConsult(conversationId, participantId, body)

Initiate voice consult transfer

postConversationsCallParticipantVoiceConsult is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/conversations/calls/{conversationId}/participants/{participantId}/voice/consult  

Requires ANY permissions: 

* conversation:communication:consultTransfer

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
ConsultTransferToAddress body = new ConsultTransferToAddress(); // ConsultTransferToAddress | Destination address & initial speak to
try {
    ConsultTransferResponse result = apiInstance.postConversationsCallParticipantVoiceConsult(conversationId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCallParticipantVoiceConsult");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **body** | [**ConsultTransferToAddress**](ConsultTransferToAddress)| Destination address &amp; initial speak to | 
{: class="table-striped"}


### Return type

[**ConsultTransferResponse**](ConsultTransferResponse)


# **postConversationsCallParticipants**


> [Conversation](Conversation) postConversationsCallParticipants(conversationId, body)

Add participants to a conversation

Wraps POST /api/v2/conversations/calls/{conversationId}/participants  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
Conversation body = new Conversation(); // Conversation | Conversation
try {
    Conversation result = apiInstance.postConversationsCallParticipants(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCallParticipants");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **body** | [**Conversation**](Conversation)| Conversation | 
{: class="table-striped"}


### Return type

[**Conversation**](Conversation)


# **postConversationsCallParticipantsUserUserId**


> [Conversation](Conversation) postConversationsCallParticipantsUserUserId(conversationId, userId, body)

Add participants to a conversation on behalf of a user

Wraps POST /api/v2/conversations/calls/{conversationId}/participants/user/{userId}  

Requires ANY permissions: 

* conversation:agentlessCall:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String userId = "userId_example"; // String | userId
Conversation body = new Conversation(); // Conversation | Conversation
try {
    Conversation result = apiInstance.postConversationsCallParticipantsUserUserId(conversationId, userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCallParticipantsUserUserId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **userId** | **String**| userId | 
| **body** | [**Conversation**](Conversation)| Conversation | 
{: class="table-striped"}


### Return type

[**Conversation**](Conversation)


# **postConversationsCallbackParticipantCommunicationWrapup**


> Void postConversationsCallbackParticipantCommunicationWrapup(conversationId, participantId, communicationId, body)

Apply wrap-up for this conversation communication

Wraps POST /api/v2/conversations/callbacks/{conversationId}/participants/{participantId}/communications/{communicationId}/wrapup  

Requires ANY permissions: 

* conversation:participant:wrapup

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
WrapupInput body = new WrapupInput(); // WrapupInput | Wrap-up
try {
    apiInstance.postConversationsCallbackParticipantCommunicationWrapup(conversationId, participantId, communicationId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCallbackParticipantCommunicationWrapup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **communicationId** | **String**| communicationId | 
| **body** | [**WrapupInput**](WrapupInput)| Wrap-up | [optional] 
{: class="table-striped"}


### Return type

null (empty response body)


# **postConversationsCallbackParticipantReplace**


> Void postConversationsCallbackParticipantReplace(conversationId, participantId, body)

Replace this participant with the specified user and/or address

Wraps POST /api/v2/conversations/callbacks/{conversationId}/participants/{participantId}/replace  

Requires ANY permissions: 

* conversation:communication:blindTransfer

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
TransferRequest body = new TransferRequest(); // TransferRequest | Transfer request
try {
    apiInstance.postConversationsCallbackParticipantReplace(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCallbackParticipantReplace");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **body** | [**TransferRequest**](TransferRequest)| Transfer request | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postConversationsCallbacks**


> [CreateCallbackResponse](CreateCallbackResponse) postConversationsCallbacks(body)

Create a Callback

Wraps POST /api/v2/conversations/callbacks  

Requires ALL permissions: 

* conversation:callback:create

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
CreateCallbackCommand body = new CreateCallbackCommand(); // CreateCallbackCommand | Callback
try {
    CreateCallbackResponse result = apiInstance.postConversationsCallbacks(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCallbacks");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CreateCallbackCommand**](CreateCallbackCommand)| Callback | 
{: class="table-striped"}


### Return type

[**CreateCallbackResponse**](CreateCallbackResponse)


# **postConversationsCallbacksBulkDisconnect**


> Void postConversationsCallbacksBulkDisconnect(body)

Disconnect multiple scheduled callbacks

Wraps POST /api/v2/conversations/callbacks/bulk/disconnect  

Requires ANY permissions: 

* conversation:communication:disconnect

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
BulkCallbackDisconnectRequest body = new BulkCallbackDisconnectRequest(); // BulkCallbackDisconnectRequest | BulkCallbackDisconnectRequest
try {
    apiInstance.postConversationsCallbacksBulkDisconnect(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCallbacksBulkDisconnect");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**BulkCallbackDisconnectRequest**](BulkCallbackDisconnectRequest)| BulkCallbackDisconnectRequest | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postConversationsCallbacksBulkUpdate**


> [BulkCallbackPatchResponse](BulkCallbackPatchResponse) postConversationsCallbacksBulkUpdate(body)

Update multiple scheduled callbacks

Wraps POST /api/v2/conversations/callbacks/bulk/update  

Requires ANY permissions: 

* conversation:callback:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
BulkCallbackPatchRequest body = new BulkCallbackPatchRequest(); // BulkCallbackPatchRequest | BulkCallbackPatchRequest
try {
    BulkCallbackPatchResponse result = apiInstance.postConversationsCallbacksBulkUpdate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCallbacksBulkUpdate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**BulkCallbackPatchRequest**](BulkCallbackPatchRequest)| BulkCallbackPatchRequest | 
{: class="table-striped"}


### Return type

[**BulkCallbackPatchResponse**](BulkCallbackPatchResponse)


# **postConversationsCalls**


> [CreateCallResponse](CreateCallResponse) postConversationsCalls(body)

Create a call conversation

Wraps POST /api/v2/conversations/calls  

Requires ANY permissions: 

* conversation:conference:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
CreateCallRequest body = new CreateCallRequest(); // CreateCallRequest | Call request
try {
    CreateCallResponse result = apiInstance.postConversationsCalls(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCalls");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CreateCallRequest**](CreateCallRequest)| Call request | 
{: class="table-striped"}


### Return type

[**CreateCallResponse**](CreateCallResponse)


# **postConversationsCallsUserUserId**


> [CreateCallResponse](CreateCallResponse) postConversationsCallsUserUserId(userId, body)

Create a call conversation on behalf of a user

Wraps POST /api/v2/conversations/calls/user/{userId}  

Requires ANY permissions: 

* conversation:agentlessCall:add
* conversation:call:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String userId = "userId_example"; // String | userId
CreateCallRequest body = new CreateCallRequest(); // CreateCallRequest | Call request
try {
    CreateCallResponse result = apiInstance.postConversationsCallsUserUserId(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCallsUserUserId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| userId | 
| **body** | [**CreateCallRequest**](CreateCallRequest)| Call request | 
{: class="table-striped"}


### Return type

[**CreateCallResponse**](CreateCallResponse)


# **postConversationsChatCommunicationMessages**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [WebChatMessage](WebChatMessage) postConversationsChatCommunicationMessages(conversationId, communicationId, body)

Send a message on behalf of a communication in a chat conversation.

This endpoint is deprecated. Please see the article https://help.genesys.cloud/articles/deprecation-removal-of-acd-web-chat-version-2/.

Wraps POST /api/v2/conversations/chats/{conversationId}/communications/{communicationId}/messages  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String communicationId = "communicationId_example"; // String | communicationId
CreateWebChatMessageRequest body = new CreateWebChatMessageRequest(); // CreateWebChatMessageRequest | Message
try {
    WebChatMessage result = apiInstance.postConversationsChatCommunicationMessages(conversationId, communicationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsChatCommunicationMessages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **communicationId** | **String**| communicationId | 
| **body** | [**CreateWebChatMessageRequest**](CreateWebChatMessageRequest)| Message | 
{: class="table-striped"}


### Return type

[**WebChatMessage**](WebChatMessage)


# **postConversationsChatCommunicationTyping**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [WebChatTyping](WebChatTyping) postConversationsChatCommunicationTyping(conversationId, communicationId)

Send a typing-indicator on behalf of a communication in a chat conversation.

This endpoint is deprecated. Please see the article https://help.genesys.cloud/articles/deprecation-removal-of-acd-web-chat-version-2/.

Wraps POST /api/v2/conversations/chats/{conversationId}/communications/{communicationId}/typing  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String communicationId = "communicationId_example"; // String | communicationId
try {
    WebChatTyping result = apiInstance.postConversationsChatCommunicationTyping(conversationId, communicationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsChatCommunicationTyping");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **communicationId** | **String**| communicationId | 
{: class="table-striped"}


### Return type

[**WebChatTyping**](WebChatTyping)


# **postConversationsChatParticipantCommunicationWrapup**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> Void postConversationsChatParticipantCommunicationWrapup(conversationId, participantId, communicationId, body)

Apply wrap-up for this conversation communication

This endpoint is deprecated. Please see the article https://help.genesys.cloud/articles/deprecation-removal-of-acd-web-chat-version-2/.

Wraps POST /api/v2/conversations/chats/{conversationId}/participants/{participantId}/communications/{communicationId}/wrapup  

Requires ANY permissions: 

* conversation:participant:wrapup

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
WrapupInput body = new WrapupInput(); // WrapupInput | Wrap-up
try {
    apiInstance.postConversationsChatParticipantCommunicationWrapup(conversationId, participantId, communicationId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsChatParticipantCommunicationWrapup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **communicationId** | **String**| communicationId | 
| **body** | [**WrapupInput**](WrapupInput)| Wrap-up | [optional] 
{: class="table-striped"}


### Return type

null (empty response body)


# **postConversationsChatParticipantReplace**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> Void postConversationsChatParticipantReplace(conversationId, participantId, body)

Replace this participant with the specified user and/or address

This endpoint is deprecated. Please see the article https://help.genesys.cloud/articles/deprecation-removal-of-acd-web-chat-version-2/.

Wraps POST /api/v2/conversations/chats/{conversationId}/participants/{participantId}/replace  

Requires ANY permissions: 

* conversation:communication:blindTransfer

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
TransferRequest body = new TransferRequest(); // TransferRequest | Transfer request
try {
    apiInstance.postConversationsChatParticipantReplace(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsChatParticipantReplace");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **body** | [**TransferRequest**](TransferRequest)| Transfer request | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postConversationsChats**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [ChatConversation](ChatConversation) postConversationsChats(body)

Create a web chat conversation

This endpoint is deprecated. Please see the article https://help.genesys.cloud/articles/deprecation-removal-of-acd-web-chat-version-2/.

Wraps POST /api/v2/conversations/chats  

Requires ALL permissions: 

* conversation:webchat:create

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
CreateWebChatRequest body = new CreateWebChatRequest(); // CreateWebChatRequest | Create web chat request
try {
    ChatConversation result = apiInstance.postConversationsChats(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsChats");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CreateWebChatRequest**](CreateWebChatRequest)| Create web chat request | 
{: class="table-striped"}


### Return type

[**ChatConversation**](ChatConversation)


# **postConversationsCobrowsesessionParticipantCommunicationWrapup**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> Void postConversationsCobrowsesessionParticipantCommunicationWrapup(conversationId, participantId, communicationId, body)

Apply wrap-up for this conversation communication

This endpoint is deprecated. Please see the article https://help.genesys.cloud/articles/deprecation-legacy-co-browse-and-screenshare/

Wraps POST /api/v2/conversations/cobrowsesessions/{conversationId}/participants/{participantId}/communications/{communicationId}/wrapup  

Requires ANY permissions: 

* conversation:participant:wrapup

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
WrapupInput body = new WrapupInput(); // WrapupInput | Wrap-up
try {
    apiInstance.postConversationsCobrowsesessionParticipantCommunicationWrapup(conversationId, participantId, communicationId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCobrowsesessionParticipantCommunicationWrapup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **communicationId** | **String**| communicationId | 
| **body** | [**WrapupInput**](WrapupInput)| Wrap-up | [optional] 
{: class="table-striped"}


### Return type

null (empty response body)


# **postConversationsCobrowsesessionParticipantReplace**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> Void postConversationsCobrowsesessionParticipantReplace(conversationId, participantId, body)

Replace this participant with the specified user and/or address

This endpoint is deprecated. Please see the article https://help.genesys.cloud/articles/deprecation-legacy-co-browse-and-screenshare/

Wraps POST /api/v2/conversations/cobrowsesessions/{conversationId}/participants/{participantId}/replace  

Requires ANY permissions: 

* conversation:communication:blindTransfer

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
TransferRequest body = new TransferRequest(); // TransferRequest | 
try {
    apiInstance.postConversationsCobrowsesessionParticipantReplace(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCobrowsesessionParticipantReplace");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **body** | [**TransferRequest**](TransferRequest)|  | [optional] 
{: class="table-striped"}


### Return type

null (empty response body)


# **postConversationsEmailInboundmessages**


> [EmailConversation](EmailConversation) postConversationsEmailInboundmessages(conversationId, body)

Send an email to an external conversation. An external conversation is one where the provider is not PureCloud based. This endpoint allows the sender of the external email to reply or send a new message to the existing conversation. The new message will be treated as part of the existing conversation and chained to it.

Wraps POST /api/v2/conversations/emails/{conversationId}/inboundmessages  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
InboundMessageRequest body = new InboundMessageRequest(); // InboundMessageRequest | Send external email reply
try {
    EmailConversation result = apiInstance.postConversationsEmailInboundmessages(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsEmailInboundmessages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **body** | [**InboundMessageRequest**](InboundMessageRequest)| Send external email reply | 
{: class="table-striped"}


### Return type

[**EmailConversation**](EmailConversation)


# **postConversationsEmailMessages**


> [EmailMessageReply](EmailMessageReply) postConversationsEmailMessages(conversationId, body)

Send an email reply

Wraps POST /api/v2/conversations/emails/{conversationId}/messages  

Requires ANY permissions: 

* conversation:email:send

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
EmailMessage body = new EmailMessage(); // EmailMessage | Reply
try {
    EmailMessageReply result = apiInstance.postConversationsEmailMessages(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsEmailMessages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **body** | [**EmailMessage**](EmailMessage)| Reply | 
{: class="table-striped"}


### Return type

[**EmailMessageReply**](EmailMessageReply)


# **postConversationsEmailMessagesDraftAttachmentsCopy**


> [EmailMessage](EmailMessage) postConversationsEmailMessagesDraftAttachmentsCopy(conversationId, body)

Copy attachments from an email message to the current draft.

Wraps POST /api/v2/conversations/emails/{conversationId}/messages/draft/attachments/copy  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
CopyAttachmentsRequest body = new CopyAttachmentsRequest(); // CopyAttachmentsRequest | Copy Attachment Request
try {
    EmailMessage result = apiInstance.postConversationsEmailMessagesDraftAttachmentsCopy(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsEmailMessagesDraftAttachmentsCopy");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **body** | [**CopyAttachmentsRequest**](CopyAttachmentsRequest)| Copy Attachment Request | 
{: class="table-striped"}


### Return type

[**EmailMessage**](EmailMessage)


# **postConversationsEmailParticipantCommunicationWrapup**


> Void postConversationsEmailParticipantCommunicationWrapup(conversationId, participantId, communicationId, body)

Apply wrap-up for this conversation communication

Wraps POST /api/v2/conversations/emails/{conversationId}/participants/{participantId}/communications/{communicationId}/wrapup  

Requires ANY permissions: 

* conversation:participant:wrapup

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
WrapupInput body = new WrapupInput(); // WrapupInput | Wrap-up
try {
    apiInstance.postConversationsEmailParticipantCommunicationWrapup(conversationId, participantId, communicationId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsEmailParticipantCommunicationWrapup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **communicationId** | **String**| communicationId | 
| **body** | [**WrapupInput**](WrapupInput)| Wrap-up | [optional] 
{: class="table-striped"}


### Return type

null (empty response body)


# **postConversationsEmailParticipantReplace**


> Void postConversationsEmailParticipantReplace(conversationId, participantId, body)

Replace this participant with the specified user and/or address

Wraps POST /api/v2/conversations/emails/{conversationId}/participants/{participantId}/replace  

Requires ANY permissions: 

* conversation:communication:blindTransfer

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
TransferRequest body = new TransferRequest(); // TransferRequest | Transfer request
try {
    apiInstance.postConversationsEmailParticipantReplace(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsEmailParticipantReplace");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **body** | [**TransferRequest**](TransferRequest)| Transfer request | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postConversationsEmailReconnect**


> Void postConversationsEmailReconnect(conversationId)

Reconnect the user to the most recently disconnected customer on a fully disconnected email conversation

This request is not valid when using the Client Credentials OAuth grant.

Wraps POST /api/v2/conversations/emails/{conversationId}/reconnect  

Requires ANY permissions: 

* conversation:communication:reconnect

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
try {
    apiInstance.postConversationsEmailReconnect(conversationId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsEmailReconnect");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postConversationsEmails**


> [EmailConversation](EmailConversation) postConversationsEmails(body)

Create an email conversation

If the direction of the request is INBOUND, this will create an external conversation with a third party provider. If the direction of the the request is OUTBOUND, this will create a conversation to send outbound emails on behalf of a queue.

Wraps POST /api/v2/conversations/emails  

Requires ANY permissions: 

* conversation:email:create

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
CreateEmailRequest body = new CreateEmailRequest(); // CreateEmailRequest | Create email request
try {
    EmailConversation result = apiInstance.postConversationsEmails(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsEmails");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CreateEmailRequest**](CreateEmailRequest)| Create email request | 
{: class="table-striped"}


### Return type

[**EmailConversation**](EmailConversation)


# **postConversationsEmailsAgentless**


> [AgentlessEmailSendResponseDto](AgentlessEmailSendResponseDto) postConversationsEmailsAgentless(body)

Create an email conversation, per API

Wraps POST /api/v2/conversations/emails/agentless  

Requires ANY permissions: 

* conversation:email:create
* conversation:agentlessEmail:send

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
AgentlessEmailSendRequestDto body = new AgentlessEmailSendRequestDto(); // AgentlessEmailSendRequestDto | Create agentless email request
try {
    AgentlessEmailSendResponseDto result = apiInstance.postConversationsEmailsAgentless(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsEmailsAgentless");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**AgentlessEmailSendRequestDto**](AgentlessEmailSendRequestDto)| Create agentless email request | 
{: class="table-striped"}


### Return type

[**AgentlessEmailSendResponseDto**](AgentlessEmailSendResponseDto)


# **postConversationsFaxes**


> [FaxSendResponse](FaxSendResponse) postConversationsFaxes(body)

Create Fax Conversation

Wraps POST /api/v2/conversations/faxes  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
FaxSendRequest body = new FaxSendRequest(); // FaxSendRequest | Fax
try {
    FaxSendResponse result = apiInstance.postConversationsFaxes(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsFaxes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**FaxSendRequest**](FaxSendRequest)| Fax | 
{: class="table-striped"}


### Return type

[**FaxSendResponse**](FaxSendResponse)


# **postConversationsKeyconfigurations**


> [ConversationEncryptionConfiguration](ConversationEncryptionConfiguration) postConversationsKeyconfigurations(body)

Setup configurations for encryption key creation

Wraps POST /api/v2/conversations/keyconfigurations  

Requires ANY permissions: 

* conversation:encryptionKey:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
ConversationEncryptionConfiguration body = new ConversationEncryptionConfiguration(); // ConversationEncryptionConfiguration | Encryption Configuration
try {
    ConversationEncryptionConfiguration result = apiInstance.postConversationsKeyconfigurations(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsKeyconfigurations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ConversationEncryptionConfiguration**](ConversationEncryptionConfiguration)| Encryption Configuration | 
{: class="table-striped"}


### Return type

[**ConversationEncryptionConfiguration**](ConversationEncryptionConfiguration)


# **postConversationsKeyconfigurationsValidate**


> [ConversationEncryptionConfiguration](ConversationEncryptionConfiguration) postConversationsKeyconfigurationsValidate(body)

Validate encryption key configurations without saving it

Wraps POST /api/v2/conversations/keyconfigurations/validate  

Requires ANY permissions: 

* conversation:encryptionKey:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
ConversationEncryptionConfiguration body = new ConversationEncryptionConfiguration(); // ConversationEncryptionConfiguration | Encryption Configuration
try {
    ConversationEncryptionConfiguration result = apiInstance.postConversationsKeyconfigurationsValidate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsKeyconfigurationsValidate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ConversationEncryptionConfiguration**](ConversationEncryptionConfiguration)| Encryption Configuration | 
{: class="table-striped"}


### Return type

[**ConversationEncryptionConfiguration**](ConversationEncryptionConfiguration)


# **postConversationsMessageCommunicationMessages**


> [MessageData](MessageData) postConversationsMessageCommunicationMessages(conversationId, communicationId, body, useNormalizedMessage)

Send message

Send message on existing conversation/communication. Only one message body field can be accepted, per request. Example: 1 textBody, 1 mediaId, or 1 messageTemplate.

Wraps POST /api/v2/conversations/messages/{conversationId}/communications/{communicationId}/messages  

Requires ANY permissions: 

* conversation:message:create
* conversation:webmessaging:create

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String communicationId = "communicationId_example"; // String | communicationId
AdditionalMessage body = new AdditionalMessage(); // AdditionalMessage | Message
Boolean useNormalizedMessage = false; // Boolean | If true, response removes deprecated fields (textBody, media)
try {
    MessageData result = apiInstance.postConversationsMessageCommunicationMessages(conversationId, communicationId, body, useNormalizedMessage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessageCommunicationMessages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **communicationId** | **String**| communicationId | 
| **body** | [**AdditionalMessage**](AdditionalMessage)| Message | 
| **useNormalizedMessage** | **Boolean**| If true, response removes deprecated fields (textBody, media) | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**MessageData**](MessageData)


# **postConversationsMessageCommunicationMessagesMedia**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [MessageMediaData](MessageMediaData) postConversationsMessageCommunicationMessagesMedia(conversationId, communicationId)

Create media

See https://developer.genesys.cloud/api/rest/v2/conversations/messaging-media-upload for example usage.

Wraps POST /api/v2/conversations/messages/{conversationId}/communications/{communicationId}/messages/media  

Requires ANY permissions: 

* conversation:message:create
* conversation:webmessaging:create
* conversation:socialmedia:create

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String communicationId = "communicationId_example"; // String | communicationId
try {
    MessageMediaData result = apiInstance.postConversationsMessageCommunicationMessagesMedia(conversationId, communicationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessageCommunicationMessagesMedia");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **communicationId** | **String**| communicationId | 
{: class="table-striped"}


### Return type

[**MessageMediaData**](MessageMediaData)


# **postConversationsMessageCommunicationMessagesMediaUploads**


> [MessageMediaUploadData](MessageMediaUploadData) postConversationsMessageCommunicationMessagesMediaUploads(conversationId, communicationId, body)

Create a URL to upload a message media file

See https://developer.genesys.cloud/api/rest/v2/conversations/messaging-media-upload for example usage.

Wraps POST /api/v2/conversations/messages/{conversationId}/communications/{communicationId}/messages/media/uploads  

Requires ANY permissions: 

* conversation:message:create
* conversation:webmessaging:create
* conversation:socialmedia:create

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String communicationId = "communicationId_example"; // String | communicationId
UploadMediaRequest body = new UploadMediaRequest(); // UploadMediaRequest | request
try {
    MessageMediaUploadData result = apiInstance.postConversationsMessageCommunicationMessagesMediaUploads(conversationId, communicationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessageCommunicationMessagesMediaUploads");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **communicationId** | **String**| communicationId | 
| **body** | [**UploadMediaRequest**](UploadMediaRequest)| request | 
{: class="table-striped"}


### Return type

[**MessageMediaUploadData**](MessageMediaUploadData)


# **postConversationsMessageCommunicationSocialmediaMessages**


> [SocialMediaMessageData](SocialMediaMessageData) postConversationsMessageCommunicationSocialmediaMessages(conversationId, communicationId, body)

Send a social media message

Send a social media message on existing conversation/communication.

Wraps POST /api/v2/conversations/messages/{conversationId}/communications/{communicationId}/socialmedia/messages  

Requires ANY permissions: 

* conversation:socialmedia:create

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String communicationId = "communicationId_example"; // String | communicationId
AdditionalSocialMediaMessage body = new AdditionalSocialMediaMessage(); // AdditionalSocialMediaMessage | Message
try {
    SocialMediaMessageData result = apiInstance.postConversationsMessageCommunicationSocialmediaMessages(conversationId, communicationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessageCommunicationSocialmediaMessages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **communicationId** | **String**| communicationId | 
| **body** | [**AdditionalSocialMediaMessage**](AdditionalSocialMediaMessage)| Message | 
{: class="table-striped"}


### Return type

[**SocialMediaMessageData**](SocialMediaMessageData)


# **postConversationsMessageCommunicationTyping**


> Void postConversationsMessageCommunicationTyping(conversationId, communicationId, body)

Send message typing event

Send message typing event for existing conversation/communication.

Wraps POST /api/v2/conversations/messages/{conversationId}/communications/{communicationId}/typing  

Requires ANY permissions: 

* conversation:message:create
* conversation:webmessaging:create

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String communicationId = "communicationId_example"; // String | communicationId
MessageTypingEventRequest body = new MessageTypingEventRequest(); // MessageTypingEventRequest | MessageTypingEvent
try {
    apiInstance.postConversationsMessageCommunicationTyping(conversationId, communicationId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessageCommunicationTyping");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **communicationId** | **String**| communicationId | 
| **body** | [**MessageTypingEventRequest**](MessageTypingEventRequest)| MessageTypingEvent | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postConversationsMessageInboundOpenEvent**


> [OpenEventNormalizedMessage](OpenEventNormalizedMessage) postConversationsMessageInboundOpenEvent(integrationId, body)

Send an inbound Open Event Message

Send an inbound event message to an Open Messaging integration. In order to call this endpoint you will need OAuth token generated using OAuth client credentials authorized with at least messaging scope. This will either generate a new Conversation, or be a part of an existing conversation. See https://developer.genesys.cloud/api/digital/openmessaging/ for example usage.

Wraps POST /api/v2/conversations/messages/{integrationId}/inbound/open/event  

Requires ALL permissions: 

* conversation:message:receive

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | integrationId
OpenInboundNormalizedEvent body = new OpenInboundNormalizedEvent(); // OpenInboundNormalizedEvent | NormalizedMessage
try {
    OpenEventNormalizedMessage result = apiInstance.postConversationsMessageInboundOpenEvent(integrationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessageInboundOpenEvent");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| integrationId | 
| **body** | [**OpenInboundNormalizedEvent**](OpenInboundNormalizedEvent)| NormalizedMessage | 
{: class="table-striped"}


### Return type

[**OpenEventNormalizedMessage**](OpenEventNormalizedMessage)


# **postConversationsMessageInboundOpenMessage**


> [OpenMessageNormalizedMessage](OpenMessageNormalizedMessage) postConversationsMessageInboundOpenMessage(integrationId, body, prefetchConversationId)

Send inbound Open Message

Send an inbound message to an Open Messaging integration. In order to call this endpoint you will need OAuth token generated using OAuth client credentials authorized with at least messaging scope. This will either generate a new Conversation, or be a part of an existing conversation. See https://developer.genesys.cloud/api/digital/openmessaging/ for example usage.

Wraps POST /api/v2/conversations/messages/{integrationId}/inbound/open/message  

Requires ALL permissions: 

* conversation:message:receive

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | integrationId
OpenInboundNormalizedMessage body = new OpenInboundNormalizedMessage(); // OpenInboundNormalizedMessage | NormalizedMessage
Boolean prefetchConversationId = false; // Boolean | Indicates whether or not to prefetch conversationId
try {
    OpenMessageNormalizedMessage result = apiInstance.postConversationsMessageInboundOpenMessage(integrationId, body, prefetchConversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessageInboundOpenMessage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| integrationId | 
| **body** | [**OpenInboundNormalizedMessage**](OpenInboundNormalizedMessage)| NormalizedMessage | 
| **prefetchConversationId** | **Boolean**| Indicates whether or not to prefetch conversationId | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**OpenMessageNormalizedMessage**](OpenMessageNormalizedMessage)


# **postConversationsMessageInboundOpenReceipt**


> [OpenReceiptNormalizedMessage](OpenReceiptNormalizedMessage) postConversationsMessageInboundOpenReceipt(integrationId, body)

Send an inbound Open Receipt Message

Send an inbound open Receipt to an Open Messaging integration. In order to call this endpoint you will need OAuth token generated using OAuth client credentials authorized with at least messaging scope. This will either generate a new Conversation, or be a part of an existing conversation. See https://developer.genesys.cloud/api/digital/openmessaging/ for example usage.

Wraps POST /api/v2/conversations/messages/{integrationId}/inbound/open/receipt  

Requires ALL permissions: 

* conversation:message:receive

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | integrationId
OpenInboundNormalizedReceipt body = new OpenInboundNormalizedReceipt(); // OpenInboundNormalizedReceipt | NormalizedMessage
try {
    OpenReceiptNormalizedMessage result = apiInstance.postConversationsMessageInboundOpenReceipt(integrationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessageInboundOpenReceipt");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| integrationId | 
| **body** | [**OpenInboundNormalizedReceipt**](OpenInboundNormalizedReceipt)| NormalizedMessage | 
{: class="table-striped"}


### Return type

[**OpenReceiptNormalizedMessage**](OpenReceiptNormalizedMessage)


# **postConversationsMessageInboundOpenStructuredResponse**


> [OpenStructuredResponseNormalizedMessage](OpenStructuredResponseNormalizedMessage) postConversationsMessageInboundOpenStructuredResponse(integrationId, body)

Send inbound Open Response

Send an inbound response for a structured message to an Open Messaging integration. In order to call this endpoint you will need OAuth token generated using OAuth client credentials authorized with at least messaging scope. This will be a part of an existing conversation. See https://developer.genesys.cloud/api/digital/openmessaging/ for example usage.

Wraps POST /api/v2/conversations/messages/{integrationId}/inbound/open/structured/response  

Requires ALL permissions: 

* conversation:message:receive

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | integrationId
OpenInboundStructuredResponseMessage body = new OpenInboundStructuredResponseMessage(); // OpenInboundStructuredResponseMessage | OpenInboundStructuredResponseMessage
try {
    OpenStructuredResponseNormalizedMessage result = apiInstance.postConversationsMessageInboundOpenStructuredResponse(integrationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessageInboundOpenStructuredResponse");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| integrationId | 
| **body** | [**OpenInboundStructuredResponseMessage**](OpenInboundStructuredResponseMessage)| OpenInboundStructuredResponseMessage | 
{: class="table-striped"}


### Return type

[**OpenStructuredResponseNormalizedMessage**](OpenStructuredResponseNormalizedMessage)


# **postConversationsMessageMessagesBulk**


> [TextMessageListing](TextMessageListing) postConversationsMessageMessagesBulk(conversationId, useNormalizedMessage, body)

Get messages in batch

The path parameter [conversationId] should contain the conversationId of the conversation being filtered. The body should contain the messageId(s) of messages being requested. For example: [\"a3069a33b-bbb1-4703-9d68-061d9e9db96e\", \"55bc6be3-078c-4a49-a4e6-1e05776ed7e8\"]

Wraps POST /api/v2/conversations/messages/{conversationId}/messages/bulk  

Requires ANY permissions: 

* conversation:message:view
* conversation:webmessaging:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | 
Boolean useNormalizedMessage = false; // Boolean | If true, response removes deprecated fields (textBody, media)
List<String> body = Arrays.asList(null); // List<String> | messageIds
try {
    TextMessageListing result = apiInstance.postConversationsMessageMessagesBulk(conversationId, useNormalizedMessage, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessageMessagesBulk");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**|  | 
| **useNormalizedMessage** | **Boolean**| If true, response removes deprecated fields (textBody, media) | [optional] [default to false] 
| **body** | [**List&lt;String&gt;**](String)| messageIds | [optional] 
{: class="table-striped"}


### Return type

[**TextMessageListing**](TextMessageListing)


# **postConversationsMessageParticipantCommunicationWrapup**


> Void postConversationsMessageParticipantCommunicationWrapup(conversationId, participantId, communicationId, body)

Apply wrap-up for this conversation communication

Wraps POST /api/v2/conversations/messages/{conversationId}/participants/{participantId}/communications/{communicationId}/wrapup  

Requires ANY permissions: 

* conversation:participant:wrapup

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
WrapupInput body = new WrapupInput(); // WrapupInput | Wrap-up
try {
    apiInstance.postConversationsMessageParticipantCommunicationWrapup(conversationId, participantId, communicationId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessageParticipantCommunicationWrapup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **communicationId** | **String**| communicationId | 
| **body** | [**WrapupInput**](WrapupInput)| Wrap-up | [optional] 
{: class="table-striped"}


### Return type

null (empty response body)


# **postConversationsMessageParticipantMonitor**


> Void postConversationsMessageParticipantMonitor(conversationId, participantId)

Listen in on the conversation from the point of view of a given participant.

Wraps POST /api/v2/conversations/messages/{conversationId}/participants/{participantId}/monitor  

Requires ANY permissions: 

* conversation:message:monitor

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
try {
    apiInstance.postConversationsMessageParticipantMonitor(conversationId, participantId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessageParticipantMonitor");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postConversationsMessageParticipantReplace**


> Void postConversationsMessageParticipantReplace(conversationId, participantId, body)

Replace this participant with the specified user and/or address

Wraps POST /api/v2/conversations/messages/{conversationId}/participants/{participantId}/replace  

Requires ANY permissions: 

* conversation:communication:blindTransfer

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
TransferRequest body = new TransferRequest(); // TransferRequest | Transfer request
try {
    apiInstance.postConversationsMessageParticipantReplace(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessageParticipantReplace");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **body** | [**TransferRequest**](TransferRequest)| Transfer request | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postConversationsMessages**


> [CreateOutboundMessagingConversationResponse](CreateOutboundMessagingConversationResponse) postConversationsMessages(body)

Create an outbound messaging conversation.

If there is an existing conversation between the remote address and the address associated with the queue specified in createOutboundRequest then the result of this request depends on the state of that conversation and the useExistingConversation field of createOutboundRequest. If the existing conversation is in alerting or connected state, then the request will fail. If the existing conversation is disconnected but still within the conversation window then the request will fail unless useExistingConversation is set to true.

Wraps POST /api/v2/conversations/messages  

Requires ALL permissions: 

* conversation:message:create

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
CreateOutboundMessagingConversationRequest body = new CreateOutboundMessagingConversationRequest(); // CreateOutboundMessagingConversationRequest | Create outbound messaging conversation
try {
    CreateOutboundMessagingConversationResponse result = apiInstance.postConversationsMessages(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CreateOutboundMessagingConversationRequest**](CreateOutboundMessagingConversationRequest)| Create outbound messaging conversation | 
{: class="table-striped"}


### Return type

[**CreateOutboundMessagingConversationResponse**](CreateOutboundMessagingConversationResponse)


# **postConversationsMessagesAgentless**


> [SendAgentlessOutboundMessageResponse](SendAgentlessOutboundMessageResponse) postConversationsMessagesAgentless(body, useNormalizedMessage)

Send an agentless outbound message

Send an agentless (api participant) outbound message using a client credential grant. In order to call this endpoint you will need OAuth token generated using OAuth client credentials authorized with at least messaging scope. If there is already a connected conversation between the 'fromAddress' and 'toAddress' specified, the 'useExistingActiveConversation' param can be used to barge in to the ongoing conversation.

Wraps POST /api/v2/conversations/messages/agentless  

Requires ALL permissions: 

* conversation:message:create

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
SendAgentlessOutboundMessageRequest body = new SendAgentlessOutboundMessageRequest(); // SendAgentlessOutboundMessageRequest | Create agentless outbound messaging request
Boolean useNormalizedMessage = false; // Boolean | If true, response removes deprecated fields (textBody, messagingTemplate)
try {
    SendAgentlessOutboundMessageResponse result = apiInstance.postConversationsMessagesAgentless(body, useNormalizedMessage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessagesAgentless");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**SendAgentlessOutboundMessageRequest**](SendAgentlessOutboundMessageRequest)| Create agentless outbound messaging request | 
| **useNormalizedMessage** | **Boolean**| If true, response removes deprecated fields (textBody, messagingTemplate) | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**SendAgentlessOutboundMessageResponse**](SendAgentlessOutboundMessageResponse)


# **postConversationsMessagesInboundOpen**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [OpenNormalizedMessage](OpenNormalizedMessage) postConversationsMessagesInboundOpen(body)

Send an inbound Open Message

[This API is deprecated. Instead, use 1. POST /api/v2/conversations/messages/{integrationId}/inbound/open/event, if you want to send an inbound Open Event Message 2. POST /api/v2/conversations/messages/{integrationId}/inbound/open/message, if you want to send an inbound Open Message 3. POST /api/v2/conversations/messages/{integrationId}/inbound/open/receipt, to send an inbound Open Receipt Message]  In order to call this endpoint you will need OAuth token generated using OAuth client credentials authorized with at least messaging scope. This will either generate a new Conversation, or be a part of an existing conversation. See https://developer.genesys.cloud/api/digital/openmessaging/ for example usage.

Wraps POST /api/v2/conversations/messages/inbound/open  

Requires ALL permissions: 

* conversation:message:receive

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
OpenNormalizedMessage body = new OpenNormalizedMessage(); // OpenNormalizedMessage | NormalizedMessage
try {
    OpenNormalizedMessage result = apiInstance.postConversationsMessagesInboundOpen(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessagesInboundOpen");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**OpenNormalizedMessage**](OpenNormalizedMessage)| NormalizedMessage | 
{: class="table-striped"}


### Return type

[**OpenNormalizedMessage**](OpenNormalizedMessage)


# **postConversationsMessagingIntegrationsApple**


> [AppleIntegration](AppleIntegration) postConversationsMessagingIntegrationsApple(body)

Create Apple Integration

Wraps POST /api/v2/conversations/messaging/integrations/apple  

Requires ALL permissions: 

* messaging:appleIntegration:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
AppleIntegrationRequest body = new AppleIntegrationRequest(); // AppleIntegrationRequest | AppleIntegrationRequest
try {
    AppleIntegration result = apiInstance.postConversationsMessagingIntegrationsApple(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessagingIntegrationsApple");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**AppleIntegrationRequest**](AppleIntegrationRequest)| AppleIntegrationRequest | 
{: class="table-striped"}


### Return type

[**AppleIntegration**](AppleIntegration)


# **postConversationsMessagingIntegrationsFacebook**


> [FacebookIntegration](FacebookIntegration) postConversationsMessagingIntegrationsFacebook(body)

Create a Facebook Integration

Wraps POST /api/v2/conversations/messaging/integrations/facebook  

Requires ALL permissions: 

* messaging:integration:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
FacebookIntegrationRequest body = new FacebookIntegrationRequest(); // FacebookIntegrationRequest | FacebookIntegrationRequest
try {
    FacebookIntegration result = apiInstance.postConversationsMessagingIntegrationsFacebook(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessagingIntegrationsFacebook");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**FacebookIntegrationRequest**](FacebookIntegrationRequest)| FacebookIntegrationRequest | 
{: class="table-striped"}


### Return type

[**FacebookIntegration**](FacebookIntegration)


# **postConversationsMessagingIntegrationsInstagram**


> [InstagramIntegration](InstagramIntegration) postConversationsMessagingIntegrationsInstagram(body)

Create Instagram Integration

Wraps POST /api/v2/conversations/messaging/integrations/instagram  

Requires ALL permissions: 

* messaging:conversationInstagramIntegration:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
InstagramIntegrationRequest body = new InstagramIntegrationRequest(); // InstagramIntegrationRequest | InstagramIntegrationRequest
try {
    InstagramIntegration result = apiInstance.postConversationsMessagingIntegrationsInstagram(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessagingIntegrationsInstagram");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**InstagramIntegrationRequest**](InstagramIntegrationRequest)| InstagramIntegrationRequest | 
{: class="table-striped"}


### Return type

[**InstagramIntegration**](InstagramIntegration)


# **postConversationsMessagingIntegrationsOpen**


> [OpenIntegration](OpenIntegration) postConversationsMessagingIntegrationsOpen(body)

Create an Open messaging integration

See https://developer.genesys.cloud/api/digital/openmessaging/ for more information.

Wraps POST /api/v2/conversations/messaging/integrations/open  

Requires ALL permissions: 

* messaging:integration:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
OpenIntegrationRequest body = new OpenIntegrationRequest(); // OpenIntegrationRequest | OpenIntegrationRequest
try {
    OpenIntegration result = apiInstance.postConversationsMessagingIntegrationsOpen(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessagingIntegrationsOpen");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**OpenIntegrationRequest**](OpenIntegrationRequest)| OpenIntegrationRequest | 
{: class="table-striped"}


### Return type

[**OpenIntegration**](OpenIntegration)


# **postConversationsMessagingIntegrationsTwitter**


> [TwitterIntegration](TwitterIntegration) postConversationsMessagingIntegrationsTwitter(body)

Create Twitter Integration

Wraps POST /api/v2/conversations/messaging/integrations/twitter  

Requires ALL permissions: 

* messaging:XIntegration:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
TwitterIntegrationRequest body = new TwitterIntegrationRequest(); // TwitterIntegrationRequest | TwitterIntegrationRequest
try {
    TwitterIntegration result = apiInstance.postConversationsMessagingIntegrationsTwitter(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessagingIntegrationsTwitter");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**TwitterIntegrationRequest**](TwitterIntegrationRequest)| TwitterIntegrationRequest | 
{: class="table-striped"}


### Return type

[**TwitterIntegration**](TwitterIntegration)


# **postConversationsMessagingIntegrationsWhatsapp**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [WhatsAppIntegration](WhatsAppIntegration) postConversationsMessagingIntegrationsWhatsapp(body)

[This API is deprecated. Use POST /api/v2/conversations/messaging/integrations/whatsapp/embeddedsignup instead] Create a WhatsApp Integration

[This API is deprecated. Use POST /api/v2/conversations/messaging/integrations/whatsapp/embeddedsignup instead] You must be approved by WhatsApp to use this feature. Your approved e164-formatted phone number and valid WhatsApp certificate for your number are required. Your WhatsApp certificate must have valid base64 encoding. Please paste carefully and do not add any leading or trailing spaces. Do not alter any characters. An integration must be activated within 7 days of certificate generation. If you cannot complete the addition and activation of the number within 7 days, please obtain a new certificate before creating the integration. Integrations created with an invalid number or certificate may immediately incur additional integration fees. Please carefully enter your number and certificate as described.

Wraps POST /api/v2/conversations/messaging/integrations/whatsapp  

Requires ALL permissions: 

* messaging:whatsappIntegration:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
WhatsAppIntegrationRequest body = new WhatsAppIntegrationRequest(); // WhatsAppIntegrationRequest | WhatsAppIntegrationRequest
try {
    WhatsAppIntegration result = apiInstance.postConversationsMessagingIntegrationsWhatsapp(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessagingIntegrationsWhatsapp");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**WhatsAppIntegrationRequest**](WhatsAppIntegrationRequest)| WhatsAppIntegrationRequest | 
{: class="table-striped"}


### Return type

[**WhatsAppIntegration**](WhatsAppIntegration)


# **postConversationsMessagingIntegrationsWhatsappEmbeddedsignup**


> [WhatsAppIntegration](WhatsAppIntegration) postConversationsMessagingIntegrationsWhatsappEmbeddedsignup(body)

Create a WhatsApp Integration using the WhatsApp embedded signup flow

Use the access token returned from the embedded signup flow to obtain a list of available phone numbers that can be associated with the created integration. The returned WhatsApp integration will initially have a createStatus of Initiated until the list of available phone numbers can be obtained from the provider. Please run a GET on the created integration until it returns a createStatus of Completed, and the list of available phone numbers obtained from the provider. You can then specify one of the available phone numbers in the PATCH call on the integration to activate it.

Wraps POST /api/v2/conversations/messaging/integrations/whatsapp/embeddedsignup  

Requires ALL permissions: 

* messaging:whatsappIntegration:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
WhatsAppEmbeddedSignupIntegrationRequest body = new WhatsAppEmbeddedSignupIntegrationRequest(); // WhatsAppEmbeddedSignupIntegrationRequest | WhatsAppEmbeddedSignupIntegrationRequest
try {
    WhatsAppIntegration result = apiInstance.postConversationsMessagingIntegrationsWhatsappEmbeddedsignup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessagingIntegrationsWhatsappEmbeddedsignup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**WhatsAppEmbeddedSignupIntegrationRequest**](WhatsAppEmbeddedSignupIntegrationRequest)| WhatsAppEmbeddedSignupIntegrationRequest | 
{: class="table-striped"}


### Return type

[**WhatsAppIntegration**](WhatsAppIntegration)


# **postConversationsMessagingSettings**


> [MessagingSetting](MessagingSetting) postConversationsMessagingSettings(body)

Create a messaging setting

Wraps POST /api/v2/conversations/messaging/settings  

Requires ALL permissions: 

* messaging:setting:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
MessagingSettingRequest body = new MessagingSettingRequest(); // MessagingSettingRequest | MessagingSetting
try {
    MessagingSetting result = apiInstance.postConversationsMessagingSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessagingSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**MessagingSettingRequest**](MessagingSettingRequest)| MessagingSetting | 
{: class="table-striped"}


### Return type

[**MessagingSetting**](MessagingSetting)


# **postConversationsMessagingSupportedcontent**


> [SupportedContent](SupportedContent) postConversationsMessagingSupportedcontent(body)

Create a Supported Content profile

Wraps POST /api/v2/conversations/messaging/supportedcontent  

Requires ANY permissions: 

* messaging:supportedContent:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
SupportedContent body = new SupportedContent(); // SupportedContent | SupportedContent
try {
    SupportedContent result = apiInstance.postConversationsMessagingSupportedcontent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessagingSupportedcontent");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**SupportedContent**](SupportedContent)| SupportedContent | 
{: class="table-striped"}


### Return type

[**SupportedContent**](SupportedContent)


# **postConversationsParticipantsAttributesSearch**


> [JsonCursorSearchResponse](JsonCursorSearchResponse) postConversationsParticipantsAttributesSearch(body)

Search conversations

Wraps POST /api/v2/conversations/participants/attributes/search  

Requires ANY permissions: 

* conversation:participant:attributesview

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
ConversationParticipantSearchRequest body = new ConversationParticipantSearchRequest(); // ConversationParticipantSearchRequest | Search request options
try {
    JsonCursorSearchResponse result = apiInstance.postConversationsParticipantsAttributesSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsParticipantsAttributesSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ConversationParticipantSearchRequest**](ConversationParticipantSearchRequest)| Search request options | 
{: class="table-striped"}


### Return type

[**JsonCursorSearchResponse**](JsonCursorSearchResponse)


# **postConversationsScreenshareParticipantCommunicationWrapup**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> Void postConversationsScreenshareParticipantCommunicationWrapup(conversationId, participantId, communicationId, body)

Apply wrap-up for this conversation communication

This endpoint is deprecated. Please see the article https://help.genesys.cloud/articles/deprecation-legacy-co-browse-and-screenshare/

Wraps POST /api/v2/conversations/screenshares/{conversationId}/participants/{participantId}/communications/{communicationId}/wrapup  

Requires ANY permissions: 

* conversation:participant:wrapup

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
WrapupInput body = new WrapupInput(); // WrapupInput | Wrap-up
try {
    apiInstance.postConversationsScreenshareParticipantCommunicationWrapup(conversationId, participantId, communicationId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsScreenshareParticipantCommunicationWrapup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **communicationId** | **String**| communicationId | 
| **body** | [**WrapupInput**](WrapupInput)| Wrap-up | [optional] 
{: class="table-striped"}


### Return type

null (empty response body)


# **postConversationsSocialParticipantCommunicationWrapup**


> Void postConversationsSocialParticipantCommunicationWrapup(conversationId, participantId, communicationId, body)

Apply wrap-up for this conversation communication

Wraps POST /api/v2/conversations/socials/{conversationId}/participants/{participantId}/communications/{communicationId}/wrapup  

Requires ANY permissions: 

* conversation:participant:wrapup

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
WrapupInput body = new WrapupInput(); // WrapupInput | Wrap-up
try {
    apiInstance.postConversationsSocialParticipantCommunicationWrapup(conversationId, participantId, communicationId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsSocialParticipantCommunicationWrapup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **communicationId** | **String**| communicationId | 
| **body** | [**WrapupInput**](WrapupInput)| Wrap-up | [optional] 
{: class="table-striped"}


### Return type

null (empty response body)


# **postConversationsVideoAgentconferenceCommunication**


> [VideoConferenceDetails](VideoConferenceDetails) postConversationsVideoAgentconferenceCommunication(conversationId, communicationId)

Create an Agent-Type video conference and assign an agent to it

postConversationsVideoAgentconferenceCommunication is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/conversations/videos/{conversationId}/agentconference/communications/{communicationId}  

Requires ANY permissions: 

* conversation:video:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String communicationId = "communicationId_example"; // String | communicationId
try {
    VideoConferenceDetails result = apiInstance.postConversationsVideoAgentconferenceCommunication(conversationId, communicationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsVideoAgentconferenceCommunication");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **communicationId** | **String**| communicationId | 
{: class="table-striped"}


### Return type

[**VideoConferenceDetails**](VideoConferenceDetails)


# **postConversationsVideoParticipantCommunicationWrapup**


> Void postConversationsVideoParticipantCommunicationWrapup(conversationId, participantId, communicationId, body)

Apply wrap-up for this conversation communication

Wraps POST /api/v2/conversations/videos/{conversationId}/participants/{participantId}/communications/{communicationId}/wrapup  

Requires ANY permissions: 

* conversation:participant:wrapup

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
WrapupInput body = new WrapupInput(); // WrapupInput | Wrap-up
try {
    apiInstance.postConversationsVideoParticipantCommunicationWrapup(conversationId, participantId, communicationId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsVideoParticipantCommunicationWrapup");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **communicationId** | **String**| communicationId | 
| **body** | [**WrapupInput**](WrapupInput)| Wrap-up | [optional] 
{: class="table-striped"}


### Return type

null (empty response body)


# **postConversationsVideosMeetings**


> [MeetingIdRecord](MeetingIdRecord) postConversationsVideosMeetings(body)

Generate a meetingId for a given conferenceId

postConversationsVideosMeetings is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/conversations/videos/meetings  

Requires ANY permissions: 

* video:video:access

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
GenerateMeetingIdRequest body = new GenerateMeetingIdRequest(); // GenerateMeetingIdRequest | MeetingIdRequest
try {
    MeetingIdRecord result = apiInstance.postConversationsVideosMeetings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsVideosMeetings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**GenerateMeetingIdRequest**](GenerateMeetingIdRequest)| MeetingIdRequest | 
{: class="table-striped"}


### Return type

[**MeetingIdRecord**](MeetingIdRecord)


# **putConversationParticipantFlaggedreason**


> Void putConversationParticipantFlaggedreason(conversationId, participantId)

Set flagged reason on conversation participant to indicate bad conversation quality.

Wraps PUT /api/v2/conversations/{conversationId}/participants/{participantId}/flaggedreason  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
try {
    apiInstance.putConversationParticipantFlaggedreason(conversationId, participantId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#putConversationParticipantFlaggedreason");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | 
| **participantId** | **String**| participant ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **putConversationSecureattributes**


> String putConversationSecureattributes(conversationId, body)

Set the secure attributes on a conversation.

Wraps PUT /api/v2/conversations/{conversationId}/secureattributes  

Requires ANY permissions: 

* conversation:participant:attributesedit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
ConversationSecureAttributes body = new ConversationSecureAttributes(); // ConversationSecureAttributes | Conversation Secure Attributes
try {
    String result = apiInstance.putConversationSecureattributes(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#putConversationSecureattributes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | 
| **body** | [**ConversationSecureAttributes**](ConversationSecureAttributes)| Conversation Secure Attributes | 
{: class="table-striped"}


### Return type

**String**


# **putConversationTags**


> String putConversationTags(conversationId, body)

Update the tags on a conversation.

Wraps PUT /api/v2/conversations/{conversationId}/tags  

Requires ANY permissions: 

* conversation:externalTag:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
ConversationTagsUpdate body = new ConversationTagsUpdate(); // ConversationTagsUpdate | Conversation Tags
try {
    String result = apiInstance.putConversationTags(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#putConversationTags");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversation ID | 
| **body** | [**ConversationTagsUpdate**](ConversationTagsUpdate)| Conversation Tags | 
{: class="table-striped"}


### Return type

**String**


# **putConversationsCallParticipantCommunicationUuidata**


> Empty putConversationsCallParticipantCommunicationUuidata(conversationId, participantId, communicationId, body)

Set uuiData to be sent on future commands.

Wraps PUT /api/v2/conversations/calls/{conversationId}/participants/{participantId}/communications/{communicationId}/uuidata  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
SetUuiDataRequest body = new SetUuiDataRequest(); // SetUuiDataRequest | UUIData Request
try {
    Empty result = apiInstance.putConversationsCallParticipantCommunicationUuidata(conversationId, participantId, communicationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#putConversationsCallParticipantCommunicationUuidata");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **participantId** | **String**| participantId | 
| **communicationId** | **String**| communicationId | 
| **body** | [**SetUuiDataRequest**](SetUuiDataRequest)| UUIData Request | 
{: class="table-striped"}


### Return type

**Empty**


# **putConversationsCallRecordingstate**


> String putConversationsCallRecordingstate(conversationId, body)

Update a conversation by setting its recording state

Wraps PUT /api/v2/conversations/calls/{conversationId}/recordingstate  

Requires ANY permissions: 

* conversation:recording:pauseOthers

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
SetRecordingState body = new SetRecordingState(); // SetRecordingState | SetRecordingState
try {
    String result = apiInstance.putConversationsCallRecordingstate(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#putConversationsCallRecordingstate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **body** | [**SetRecordingState**](SetRecordingState)| SetRecordingState | 
{: class="table-striped"}


### Return type

**String**


# **putConversationsCallbackRecordingstate**


> String putConversationsCallbackRecordingstate(conversationId, body)

Update a conversation by setting its recording state

Wraps PUT /api/v2/conversations/callbacks/{conversationId}/recordingstate  

Requires ANY permissions: 

* conversation:recording:pauseOthers

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
SetRecordingState body = new SetRecordingState(); // SetRecordingState | SetRecordingState
try {
    String result = apiInstance.putConversationsCallbackRecordingstate(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#putConversationsCallbackRecordingstate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **body** | [**SetRecordingState**](SetRecordingState)| SetRecordingState | 
{: class="table-striped"}


### Return type

**String**


# **putConversationsChatRecordingstate**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> String putConversationsChatRecordingstate(conversationId, body)

Update a conversation by setting its recording state

This endpoint is deprecated. Please see the article https://help.genesys.cloud/articles/deprecation-removal-of-acd-web-chat-version-2/.

Wraps PUT /api/v2/conversations/chats/{conversationId}/recordingstate  

Requires ANY permissions: 

* conversation:recording:pauseOthers

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
SetRecordingState body = new SetRecordingState(); // SetRecordingState | SetRecordingState
try {
    String result = apiInstance.putConversationsChatRecordingstate(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#putConversationsChatRecordingstate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **body** | [**SetRecordingState**](SetRecordingState)| SetRecordingState | 
{: class="table-striped"}


### Return type

**String**


# **putConversationsCobrowsesessionRecordingstate**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> String putConversationsCobrowsesessionRecordingstate(conversationId, body)

Update a conversation by setting its recording state

This endpoint is deprecated. Please see the article https://help.genesys.cloud/articles/deprecation-legacy-co-browse-and-screenshare/

Wraps PUT /api/v2/conversations/cobrowsesessions/{conversationId}/recordingstate  

Requires ANY permissions: 

* conversation:recording:pauseOthers

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
SetRecordingState body = new SetRecordingState(); // SetRecordingState | SetRecordingState
try {
    String result = apiInstance.putConversationsCobrowsesessionRecordingstate(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#putConversationsCobrowsesessionRecordingstate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **body** | [**SetRecordingState**](SetRecordingState)| SetRecordingState | 
{: class="table-striped"}


### Return type

**String**


# **putConversationsEmailMessagesDraft**


> [EmailMessage](EmailMessage) putConversationsEmailMessagesDraft(conversationId, body)

Update conversation draft reply

Wraps PUT /api/v2/conversations/emails/{conversationId}/messages/draft  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
EmailMessage body = new EmailMessage(); // EmailMessage | Draft
try {
    EmailMessage result = apiInstance.putConversationsEmailMessagesDraft(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#putConversationsEmailMessagesDraft");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **body** | [**EmailMessage**](EmailMessage)| Draft | 
{: class="table-striped"}


### Return type

[**EmailMessage**](EmailMessage)


# **putConversationsEmailRecordingstate**


> String putConversationsEmailRecordingstate(conversationId, body)

Update a conversation by setting its recording state

Wraps PUT /api/v2/conversations/emails/{conversationId}/recordingstate  

Requires ANY permissions: 

* conversation:recording:pauseOthers

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
SetRecordingState body = new SetRecordingState(); // SetRecordingState | SetRecordingState
try {
    String result = apiInstance.putConversationsEmailRecordingstate(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#putConversationsEmailRecordingstate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **body** | [**SetRecordingState**](SetRecordingState)| SetRecordingState | 
{: class="table-striped"}


### Return type

**String**


# **putConversationsKeyconfiguration**


> [ConversationEncryptionConfiguration](ConversationEncryptionConfiguration) putConversationsKeyconfiguration(keyconfigurationsId, body)

Update the encryption key configurations

Wraps PUT /api/v2/conversations/keyconfigurations/{keyconfigurationsId}  

Requires ANY permissions: 

* conversation:encryptionKey:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String keyconfigurationsId = "keyconfigurationsId_example"; // String | Key Configurations Id
ConversationEncryptionConfiguration body = new ConversationEncryptionConfiguration(); // ConversationEncryptionConfiguration | Encryption key configuration metadata
try {
    ConversationEncryptionConfiguration result = apiInstance.putConversationsKeyconfiguration(keyconfigurationsId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#putConversationsKeyconfiguration");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **keyconfigurationsId** | **String**| Key Configurations Id | 
| **body** | [**ConversationEncryptionConfiguration**](ConversationEncryptionConfiguration)| Encryption key configuration metadata | 
{: class="table-striped"}


### Return type

[**ConversationEncryptionConfiguration**](ConversationEncryptionConfiguration)


# **putConversationsMessageRecordingstate**


> String putConversationsMessageRecordingstate(conversationId, body)

Update a conversation by setting its recording state

Wraps PUT /api/v2/conversations/messages/{conversationId}/recordingstate  

Requires ANY permissions: 

* conversation:recording:pauseOthers

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
SetRecordingState body = new SetRecordingState(); // SetRecordingState | SetRecordingState
try {
    String result = apiInstance.putConversationsMessageRecordingstate(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#putConversationsMessageRecordingstate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **body** | [**SetRecordingState**](SetRecordingState)| SetRecordingState | 
{: class="table-striped"}


### Return type

**String**


# **putConversationsMessagingIdentityresolutionIntegrationsAppleIntegrationId**


> [IdentityResolutionConfig](IdentityResolutionConfig) putConversationsMessagingIdentityresolutionIntegrationsAppleIntegrationId(integrationId, body)

Create an identity resolution settings for a Apple messaging integration

Wraps PUT /api/v2/conversations/messaging/identityresolution/integrations/apple/{integrationId}  

Requires ALL permissions: 

* messaging:integration:edit
* messaging:identityResolutionApple:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
IdentityResolutionConfig body = new IdentityResolutionConfig(); // IdentityResolutionConfig | IdentityResolutionConfig
try {
    IdentityResolutionConfig result = apiInstance.putConversationsMessagingIdentityresolutionIntegrationsAppleIntegrationId(integrationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#putConversationsMessagingIdentityresolutionIntegrationsAppleIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
| **body** | [**IdentityResolutionConfig**](IdentityResolutionConfig)| IdentityResolutionConfig | 
{: class="table-striped"}


### Return type

[**IdentityResolutionConfig**](IdentityResolutionConfig)


# **putConversationsMessagingIdentityresolutionIntegrationsFacebookIntegrationId**


> [IdentityResolutionConfig](IdentityResolutionConfig) putConversationsMessagingIdentityresolutionIntegrationsFacebookIntegrationId(integrationId, body)

Create an identity resolution settings for a Facebook messaging integration

Wraps PUT /api/v2/conversations/messaging/identityresolution/integrations/facebook/{integrationId}  

Requires ALL permissions: 

* messaging:integration:edit
* messaging:identityResolutionFacebook:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
IdentityResolutionConfig body = new IdentityResolutionConfig(); // IdentityResolutionConfig | IdentityResolutionConfig
try {
    IdentityResolutionConfig result = apiInstance.putConversationsMessagingIdentityresolutionIntegrationsFacebookIntegrationId(integrationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#putConversationsMessagingIdentityresolutionIntegrationsFacebookIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
| **body** | [**IdentityResolutionConfig**](IdentityResolutionConfig)| IdentityResolutionConfig | 
{: class="table-striped"}


### Return type

[**IdentityResolutionConfig**](IdentityResolutionConfig)


# **putConversationsMessagingIdentityresolutionIntegrationsInstagramIntegrationId**


> [IdentityResolutionConfig](IdentityResolutionConfig) putConversationsMessagingIdentityresolutionIntegrationsInstagramIntegrationId(integrationId, body)

Create identity resolution settings for an Instagram messaging integration

Wraps PUT /api/v2/conversations/messaging/identityresolution/integrations/instagram/{integrationId}  

Requires ALL permissions: 

* messaging:integration:edit
* messaging:identityResolutionInstagram:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
IdentityResolutionConfig body = new IdentityResolutionConfig(); // IdentityResolutionConfig | IdentityResolutionConfig
try {
    IdentityResolutionConfig result = apiInstance.putConversationsMessagingIdentityresolutionIntegrationsInstagramIntegrationId(integrationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#putConversationsMessagingIdentityresolutionIntegrationsInstagramIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
| **body** | [**IdentityResolutionConfig**](IdentityResolutionConfig)| IdentityResolutionConfig | 
{: class="table-striped"}


### Return type

[**IdentityResolutionConfig**](IdentityResolutionConfig)


# **putConversationsMessagingIdentityresolutionIntegrationsOpenIntegrationId**


> [OpenMessagingIdentityResolutionConfig](OpenMessagingIdentityResolutionConfig) putConversationsMessagingIdentityresolutionIntegrationsOpenIntegrationId(integrationId, body)

Update an open messaging integration Identity Resolution settings

Wraps PUT /api/v2/conversations/messaging/identityresolution/integrations/open/{integrationId}  

Requires ALL permissions: 

* messaging:integration:edit
* messaging:identityResolutionOpen:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
OpenMessagingIdentityResolutionConfig body = new OpenMessagingIdentityResolutionConfig(); // OpenMessagingIdentityResolutionConfig | 
try {
    OpenMessagingIdentityResolutionConfig result = apiInstance.putConversationsMessagingIdentityresolutionIntegrationsOpenIntegrationId(integrationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#putConversationsMessagingIdentityresolutionIntegrationsOpenIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
| **body** | [**OpenMessagingIdentityResolutionConfig**](OpenMessagingIdentityResolutionConfig)|  | 
{: class="table-striped"}


### Return type

[**OpenMessagingIdentityResolutionConfig**](OpenMessagingIdentityResolutionConfig)


# **putConversationsMessagingIdentityresolutionIntegrationsTwitterIntegrationId**


> [IdentityResolutionConfig](IdentityResolutionConfig) putConversationsMessagingIdentityresolutionIntegrationsTwitterIntegrationId(integrationId, body)

Create an identity resolution settings for an X (Formally Twitter) messaging integration

Wraps PUT /api/v2/conversations/messaging/identityresolution/integrations/twitter/{integrationId}  

Requires ALL permissions: 

* messaging:XIntegration:edit
* messaging:identityResolutionX:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration Id
IdentityResolutionConfig body = new IdentityResolutionConfig(); // IdentityResolutionConfig | IdentityResolutionConfig
try {
    IdentityResolutionConfig result = apiInstance.putConversationsMessagingIdentityresolutionIntegrationsTwitterIntegrationId(integrationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#putConversationsMessagingIdentityresolutionIntegrationsTwitterIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration Id | 
| **body** | [**IdentityResolutionConfig**](IdentityResolutionConfig)| IdentityResolutionConfig | 
{: class="table-striped"}


### Return type

[**IdentityResolutionConfig**](IdentityResolutionConfig)


# **putConversationsMessagingIdentityresolutionIntegrationsWhatsappIntegrationId**


> [IdentityResolutionConfig](IdentityResolutionConfig) putConversationsMessagingIdentityresolutionIntegrationsWhatsappIntegrationId(integrationId, body)

Update a whatsApp integration Identity Resolution settings

Wraps PUT /api/v2/conversations/messaging/identityresolution/integrations/whatsapp/{integrationId}  

Requires ALL permissions: 

* messaging:integration:edit
* messaging:identityResolutionWhatsApp:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
IdentityResolutionConfig body = new IdentityResolutionConfig(); // IdentityResolutionConfig | 
try {
    IdentityResolutionConfig result = apiInstance.putConversationsMessagingIdentityresolutionIntegrationsWhatsappIntegrationId(integrationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#putConversationsMessagingIdentityresolutionIntegrationsWhatsappIntegrationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationId** | **String**| Integration ID | 
| **body** | [**IdentityResolutionConfig**](IdentityResolutionConfig)|  | 
{: class="table-striped"}


### Return type

[**IdentityResolutionConfig**](IdentityResolutionConfig)


# **putConversationsMessagingSettingsDefault**


> [MessagingSetting](MessagingSetting) putConversationsMessagingSettingsDefault(body)

Set the organization's default setting that may be applied to to integrations without settings

When an integration is created a settings ID may be assigned to it. If the settings ID is not supplied, the default settings will be assigned to it.

Wraps PUT /api/v2/conversations/messaging/settings/default  

Requires ALL permissions: 

* messaging:setting:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
MessagingSettingDefaultRequest body = new MessagingSettingDefaultRequest(); // MessagingSettingDefaultRequest | MessagingSetting
try {
    MessagingSetting result = apiInstance.putConversationsMessagingSettingsDefault(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#putConversationsMessagingSettingsDefault");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**MessagingSettingDefaultRequest**](MessagingSettingDefaultRequest)| MessagingSetting | 
{: class="table-striped"}


### Return type

[**MessagingSetting**](MessagingSetting)


# **putConversationsMessagingSupportedcontentDefault**


> [SupportedContent](SupportedContent) putConversationsMessagingSupportedcontentDefault(body)

Set the organization's default supported content profile that may be assigned to an integration when it is created.

When an integration is created a supported content ID may be assigned to it. If the supported content ID is not supplied, the default supported content profile will be assigned to it.

Wraps PUT /api/v2/conversations/messaging/supportedcontent/default  

Requires ALL permissions: 

* messaging:supportedContent:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
SupportedContentReference body = new SupportedContentReference(); // SupportedContentReference | SupportedContent
try {
    SupportedContent result = apiInstance.putConversationsMessagingSupportedcontentDefault(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#putConversationsMessagingSupportedcontentDefault");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**SupportedContentReference**](SupportedContentReference)| SupportedContent | 
{: class="table-striped"}


### Return type

[**SupportedContent**](SupportedContent)


# **putConversationsMessagingThreadingtimeline**


> [ConversationThreadingWindow](ConversationThreadingWindow) putConversationsMessagingThreadingtimeline(body)

Update conversation threading window timeline for each messaging type

PUT Conversation messaging threading timeline is intended to set the conversation threading settings for ALL messengerTypes. If you omit a messengerType in the request body then the setting for that messengerType will use the platform default value. The PUT replaces the existing setting(s) that were previously set for each messengerType.

Wraps PUT /api/v2/conversations/messaging/threadingtimeline  

Requires ALL permissions: 

* conversation:threadingTimeline:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
ConversationThreadingWindow body = new ConversationThreadingWindow(); // ConversationThreadingWindow | ConversationThreadingWindowRequest
try {
    ConversationThreadingWindow result = apiInstance.putConversationsMessagingThreadingtimeline(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#putConversationsMessagingThreadingtimeline");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ConversationThreadingWindow**](ConversationThreadingWindow)| ConversationThreadingWindowRequest | 
{: class="table-striped"}


### Return type

[**ConversationThreadingWindow**](ConversationThreadingWindow)


# **putConversationsScreenshareRecordingstate**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> String putConversationsScreenshareRecordingstate(conversationId, body)

Update a conversation by setting its recording state

This endpoint is deprecated. Please see the article https://help.genesys.cloud/articles/deprecation-legacy-co-browse-and-screenshare/

Wraps PUT /api/v2/conversations/screenshares/{conversationId}/recordingstate  

Requires ANY permissions: 

* conversation:recording:pauseOthers

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
SetRecordingState body = new SetRecordingState(); // SetRecordingState | SetRecordingState
try {
    String result = apiInstance.putConversationsScreenshareRecordingstate(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#putConversationsScreenshareRecordingstate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **body** | [**SetRecordingState**](SetRecordingState)| SetRecordingState | 
{: class="table-striped"}


### Return type

**String**


# **putConversationsSocialRecordingstate**


> String putConversationsSocialRecordingstate(conversationId, body)

Update a conversation by setting its recording state

Wraps PUT /api/v2/conversations/socials/{conversationId}/recordingstate  

Requires ANY permissions: 

* conversation:recording:pauseOthers

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
SetRecordingState body = new SetRecordingState(); // SetRecordingState | SetRecordingState
try {
    String result = apiInstance.putConversationsSocialRecordingstate(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#putConversationsSocialRecordingstate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **body** | [**SetRecordingState**](SetRecordingState)| SetRecordingState | 
{: class="table-striped"}


### Return type

**String**


# **putConversationsVideoRecordingstate**


> String putConversationsVideoRecordingstate(conversationId, body)

Update a conversation by setting its recording state

Wraps PUT /api/v2/conversations/videos/{conversationId}/recordingstate  

Requires ANY permissions: 

* conversation:recording:pauseOthers

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
SetRecordingState body = new SetRecordingState(); // SetRecordingState | SetRecordingState
try {
    String result = apiInstance.putConversationsVideoRecordingstate(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#putConversationsVideoRecordingstate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| conversationId | 
| **body** | [**SetRecordingState**](SetRecordingState)| SetRecordingState | 
{: class="table-striped"}


### Return type

**String**


_com.mypurecloud.sdk.v2:platform-client-v2:232.0.0_
