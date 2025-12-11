# ObservationValue


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **observationDate** | [**Date**](Date) | The time at which the observation occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **conversationId** | **String** | Unique identifier for the conversation |  [optional] |
| **sessionId** | **String** | The unique identifier of this session |  [optional] |
| **requestedRoutingSkillIds** | **List&lt;String&gt;** | Unique identifier for a skill requested for an interaction |  [optional] |
| **requestedLanguageId** | **String** | Unique identifier for the language requested for an interaction |  [optional] |
| **routingPriority** | **Long** | Routing priority for the current interaction |  [optional] |
| **participantName** | **String** | A human readable name identifying the participant |  [optional] |
| **userId** | **String** | Unique identifier for the user |  [optional] |
| **direction** | [**DirectionEnum**](#Enum--DirectionEnum) | The direction of the communication |  [optional] |
| **convertedFrom** | **String** | Session media type that was converted from in case of a media type conversion |  [optional] |
| **convertedTo** | **String** | Session media type that was converted to in case of a media type conversion |  [optional] |
| **addressFrom** | **String** | The address that initiated an action |  [optional] |
| **addressTo** | **String** | The address receiving an action |  [optional] |
| **ani** | **String** | Automatic Number Identification (caller's number) |  [optional] |
| **dnis** | **String** | Dialed number identification service (number dialed by the calling party) |  [optional] |
| **teamId** | **String** | The team id the user is a member of |  [optional] |
| **requestedRoutings** | [**List<RequestedRoutingsEnum>**](#Enum--RequestedRoutingsEnum) | All routing types for requested/attempted routing methods |  [optional] |
| **usedRouting** | [**UsedRoutingEnum**](#Enum--UsedRoutingEnum) | Complete routing method |  [optional] |
| **scoredAgents** | [**List&lt;AnalyticsScoredAgent&gt;**](AnalyticsScoredAgent) |  |  [optional] |


## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INBOUND | &quot;inbound&quot; | 
| OUTBOUND | &quot;outbound&quot; | 


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




_com.mypurecloud.sdk.v2:platform-client-v2:240.0.0_
