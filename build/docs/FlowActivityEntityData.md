# FlowActivityEntityData


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **activityDate** | [**Date**](Date) | The time at which the activity was observed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **metric** | [**MetricEnum**](#Enum--MetricEnum) | Activity metric |  [optional] |
| **activeRouting** | [**ActiveRoutingEnum**](#Enum--ActiveRoutingEnum) | Active routing method |  [optional] |
| **addressFrom** | **String** | The address that initiated an action |  [optional] |
| **addressTo** | **String** | The address receiving an action |  [optional] |
| **ani** | **String** | Automatic Number Identification (caller's number) |  [optional] |
| **conversationId** | **String** | Unique identifier for the conversation |  [optional] |
| **convertedFrom** | **String** | Session media type that was converted from in case of a media type conversion |  [optional] |
| **convertedTo** | **String** | Session media type that was converted to in case of a media type conversion |  [optional] |
| **direction** | [**DirectionEnum**](#Enum--DirectionEnum) | The direction of the communication |  [optional] |
| **dnis** | **String** | Dialed number identification service (number dialed by the calling party) |  [optional] |
| **flowId** | **String** | The unique identifier of this flow |  [optional] |
| **flowType** | [**FlowTypeEnum**](#Enum--FlowTypeEnum) | The type of this flow |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) | The session media type |  [optional] |
| **participantName** | **String** | A human readable name identifying the participant |  [optional] |
| **queueId** | **String** | Queue identifier |  [optional] |
| **requestedLanguageId** | **String** | Unique identifier for the language requested for an interaction |  [optional] |
| **requestedRoutingSkillIds** | **List&lt;String&gt;** | Unique identifier(s) for skill(s) requested for an interaction |  [optional] |
| **requestedRoutings** | [**List<RequestedRoutingsEnum>**](#Enum--RequestedRoutingsEnum) | Routing type(s) for requested/attempted routing methods. |  [optional] |
| **routingPriority** | **Long** | Routing priority for the current interaction |  [optional] |
| **sessionId** | **String** | The unique identifier of this session |  [optional] |
| **teamId** | **String** | The team ID the user is a member of |  [optional] |
| **usedRouting** | [**UsedRoutingEnum**](#Enum--UsedRoutingEnum) | Complete routing method |  [optional] |
| **userId** | **String** | Unique identifier for the user |  [optional] |
| **scoredAgents** | [**List&lt;FlowActivityScoredAgent&gt;**](FlowActivityScoredAgent) | Scored agents |  [optional] |


## Enum: MetricEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OFLOW | &quot;oFlow&quot; | 


## Enum: ActiveRoutingEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BULLSEYE | &quot;Bullseye&quot; | 
| CONDITIONAL | &quot;Conditional&quot; | 
| DIRECT | &quot;Direct&quot; | 
| LAST | &quot;Last&quot; | 
| MANUAL | &quot;Manual&quot; | 
| PREDICTIVE | &quot;Predictive&quot; | 
| PREFERRED | &quot;Preferred&quot; | 
| STANDARD | &quot;Standard&quot; | 
| VIP | &quot;Vip&quot; | 


## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INBOUND | &quot;inbound&quot; | 
| OUTBOUND | &quot;outbound&quot; | 


## Enum: FlowTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BOT | &quot;BOT&quot; | 
| COMMONMODULE | &quot;COMMONMODULE&quot; | 
| DIGITALBOT | &quot;DIGITALBOT&quot; | 
| INBOUNDCALL | &quot;INBOUNDCALL&quot; | 
| INBOUNDCHAT | &quot;INBOUNDCHAT&quot; | 
| INBOUNDEMAIL | &quot;INBOUNDEMAIL&quot; | 
| INBOUNDSHORTMESSAGE | &quot;INBOUNDSHORTMESSAGE&quot; | 
| INQUEUECALL | &quot;INQUEUECALL&quot; | 
| INQUEUEEMAIL | &quot;INQUEUEEMAIL&quot; | 
| INQUEUESHORTMESSAGE | &quot;INQUEUESHORTMESSAGE&quot; | 
| OUTBOUNDCALL | &quot;OUTBOUNDCALL&quot; | 
| SECURECALL | &quot;SECURECALL&quot; | 
| SPEECH | &quot;SPEECH&quot; | 
| SURVEYINVITE | &quot;SURVEYINVITE&quot; | 
| VOICE | &quot;VOICE&quot; | 
| VOICEMAIL | &quot;VOICEMAIL&quot; | 
| VOICESURVEY | &quot;VOICESURVEY&quot; | 
| WORKFLOW | &quot;WORKFLOW&quot; | 
| WORKITEM | &quot;WORKITEM&quot; | 


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


## Enum: RequestedRoutingsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| BULLSEYE | &quot;Bullseye&quot; |
| CONDITIONAL | &quot;Conditional&quot; |
| DIRECT | &quot;Direct&quot; |
| LAST | &quot;Last&quot; |
| MANUAL | &quot;Manual&quot; |
| PREDICTIVE | &quot;Predictive&quot; |
| PREFERRED | &quot;Preferred&quot; |
| STANDARD | &quot;Standard&quot; |
| VIP | &quot;Vip&quot; |


## Enum: UsedRoutingEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BULLSEYE | &quot;Bullseye&quot; | 
| CONDITIONAL | &quot;Conditional&quot; | 
| DIRECT | &quot;Direct&quot; | 
| LAST | &quot;Last&quot; | 
| MANUAL | &quot;Manual&quot; | 
| PREDICTIVE | &quot;Predictive&quot; | 
| PREFERRED | &quot;Preferred&quot; | 
| STANDARD | &quot;Standard&quot; | 
| VIP | &quot;Vip&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:233.0.0_
