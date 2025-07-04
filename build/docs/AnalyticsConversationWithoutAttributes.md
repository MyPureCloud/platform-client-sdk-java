# AnalyticsConversationWithoutAttributes


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **conferenceStart** | [**Date**](Date) | The start time of a conference call. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **conversationEnd** | [**Date**](Date) | The end time of a conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **conversationId** | **String** | Unique identifier for the conversation |  [optional] |
| **conversationInitiator** | [**ConversationInitiatorEnum**](#Enum--ConversationInitiatorEnum) | Indicates the participant purpose of the participant initiating a message conversation |  [optional] |
| **conversationStart** | [**Date**](Date) | The start time of a conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **customerParticipation** | **Boolean** | Indicates a messaging conversation in which the customer participated by sending at least one message |  [optional] |
| **divisionIds** | **List&lt;String&gt;** | Identifier(s) of division(s) associated with a conversation |  [optional] |
| **externalTag** | **String** | External tag for the conversation |  [optional] |
| **inactivityTimeout** | [**Date**](Date) | The time in the future, after which this conversation would be considered inactive. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **knowledgeBaseIds** | **List&lt;String&gt;** | The unique identifier(s) of the knowledge base(s) used |  [optional] |
| **mediaStatsMinConversationMos** | **Double** | The lowest estimated average MOS among all the audio streams belonging to this conversation |  [optional] |
| **mediaStatsMinConversationRFactor** | **Double** | The lowest R-factor value among all of the audio streams belonging to this conversation |  [optional] |
| **originatingDirection** | [**OriginatingDirectionEnum**](#Enum--OriginatingDirectionEnum) | The original direction of the conversation |  [optional] |
| **originatingSocialMediaPublic** | **Boolean** | Indicates that the conversation originated from a public message on social media |  [optional] |
| **selfServed** | **Boolean** | Indicates whether all flow sessions were self serviced |  [optional] |
| **evaluations** | [**List&lt;AnalyticsEvaluation&gt;**](AnalyticsEvaluation) | Evaluations associated with this conversation |  [optional] |
| **surveys** | [**List&lt;AnalyticsSurvey&gt;**](AnalyticsSurvey) | Surveys associated with this conversation |  [optional] |
| **resolutions** | [**List&lt;AnalyticsResolution&gt;**](AnalyticsResolution) | Resolutions associated with this conversation |  [optional] |
| **participants** | [**List&lt;AnalyticsParticipantWithoutAttributes&gt;**](AnalyticsParticipantWithoutAttributes) | Participants in the conversation |  [optional] |


## Enum: ConversationInitiatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACD | &quot;acd&quot; | 
| AGENT | &quot;agent&quot; | 
| API | &quot;api&quot; | 
| BOTFLOW | &quot;botflow&quot; | 
| CAMPAIGN | &quot;campaign&quot; | 
| CUSTOMER | &quot;customer&quot; | 
| DIALER | &quot;dialer&quot; | 
| EXTERNAL | &quot;external&quot; | 
| FAX | &quot;fax&quot; | 
| GROUP | &quot;group&quot; | 
| INBOUND | &quot;inbound&quot; | 
| IVR | &quot;ivr&quot; | 
| MANUAL | &quot;manual&quot; | 
| OUTBOUND | &quot;outbound&quot; | 
| STATION | &quot;station&quot; | 
| USER | &quot;user&quot; | 
| VOICEMAIL | &quot;voicemail&quot; | 
| VOICESURVEYFLOW | &quot;voicesurveyflow&quot; | 
| WORKFLOW | &quot;workflow&quot; | 


## Enum: OriginatingDirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INBOUND | &quot;inbound&quot; | 
| OUTBOUND | &quot;outbound&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
