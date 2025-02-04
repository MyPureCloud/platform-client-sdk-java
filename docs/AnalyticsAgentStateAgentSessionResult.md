# AnalyticsAgentStateAgentSessionResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **conversationId** | **String** | Conversation Id |  [optional] |
| **sessionId** | **String** | Session Id |  [optional] |
| **sessionStart** | [**Date**](Date) | Session start datetime. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **segmentStart** | [**Date**](Date) | Segment start datetime. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **segmentType** | [**SegmentTypeEnum**](#Enum--SegmentTypeEnum) | Segment type |  [optional] |
| **routedQueueId** | **String** | Routed queue Id |  [optional] |
| **requestedRoutingSkillIds** | **List&lt;String&gt;** | List of requested routing skill Id |  [optional] |
| **requestedLanguageId** | **String** | Requested language Id |  [optional] |
| **originatingDirection** | [**OriginatingDirectionEnum**](#Enum--OriginatingDirectionEnum) | Originating direction |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) | Media type |  [optional] |


## Enum: SegmentTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALERT | &quot;alert&quot; | 
| BARGING | &quot;barging&quot; | 
| CALLBACK | &quot;callback&quot; | 
| COACHING | &quot;coaching&quot; | 
| CONTACTING | &quot;contacting&quot; | 
| CONVERTING | &quot;converting&quot; | 
| DELAY | &quot;delay&quot; | 
| DIALING | &quot;dialing&quot; | 
| HOLD | &quot;hold&quot; | 
| INTERACT | &quot;interact&quot; | 
| IVR | &quot;ivr&quot; | 
| MONITORING | &quot;monitoring&quot; | 
| PARKED | &quot;parked&quot; | 
| SCHEDULED | &quot;scheduled&quot; | 
| SHARING | &quot;sharing&quot; | 
| SYSTEM | &quot;system&quot; | 
| TRANSMITTING | &quot;transmitting&quot; | 
| UNKNOWN | &quot;unknown&quot; | 
| UPLOADING | &quot;uploading&quot; | 
| VOICEMAIL | &quot;voicemail&quot; | 
| WRAPUP | &quot;wrapup&quot; | 


## Enum: OriginatingDirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INBOUND | &quot;inbound&quot; | 
| OUTBOUND | &quot;outbound&quot; | 


## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CALLBACK | &quot;callback&quot; | 
| CHAT | &quot;chat&quot; | 
| COBROWSE | &quot;cobrowse&quot; | 
| EMAIL | &quot;email&quot; | 
| INTERNALMESSAGE | &quot;internalmessage&quot; | 
| MESSAGE | &quot;message&quot; | 
| SCREENSHARE | &quot;screenshare&quot; | 
| UNKNOWN | &quot;unknown&quot; | 
| VIDEO | &quot;video&quot; | 
| VOICE | &quot;voice&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:219.0.0_
