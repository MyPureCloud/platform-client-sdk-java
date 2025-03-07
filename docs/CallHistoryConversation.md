# CallHistoryConversation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **participants** | [**List&lt;CallHistoryParticipant&gt;**](CallHistoryParticipant) | The list of participants involved in the conversation. |  [optional] |
| **direction** | [**DirectionEnum**](#Enum--DirectionEnum) | The direction of the call relating to the current user |  [optional] |
| **wentToVoicemail** | **Boolean** | Did the call end in the current user's voicemail |  [optional] |
| **missedCall** | **Boolean** | Did the user not answer this conversation |  [optional] |
| **startTime** | [**Date**](Date) | The time the user joined the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **wasConference** | **Boolean** | Was this conversation a conference |  [optional] |
| **wasCallback** | **Boolean** | Was this conversation a callback |  [optional] |
| **hadScreenShare** | **Boolean** | Did this conversation have a screen share session |  [optional] |
| **hadCobrowse** | **Boolean** | Did this conversation have a cobrowse session |  [optional] |
| **wasOutboundCampaign** | **Boolean** | Was this conversation associated with an outbound campaign |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INBOUND | &quot;inbound&quot; | 
| OUTBOUND | &quot;outbound&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:221.0.0_
