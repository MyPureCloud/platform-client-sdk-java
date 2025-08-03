# V2QueueObservationObservation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **observationDate** | [**Date**](Date) | The timestamp when the observation started |  [optional] |
| **conversationId** | **String** | Unique identifier of the conversation to which this observation belongs |  [optional] |
| **sessionId** | **String** | Unique identifier of the user session associated with this observation |  [optional] |
| **requestedRoutingSkillIds** | **List&lt;String&gt;** | Unique identifiers for skills requested for an interaction |  [optional] |
| **requestedLanguageId** | **String** | Unique identifier for the language requested for an interaction |  [optional] |
| **routingPriority** | **Long** | Routing priority for the current interaction |  [optional] |
| **participantName** | **String** | A human readable name identifying the participant |  [optional] |
| **userId** | **String** | Unique identifier for the user |  [optional] |
| **direction** | **String** | The direction of the communication |  [optional] |
| **convertedFrom** | **String** | Session media type that was converted from in case of a media type conversion |  [optional] |
| **convertedTo** | **String** | Session media type that was converted to in case of a media type conversion |  [optional] |
| **addressFrom** | **String** | The address that initiated an action |  [optional] |
| **addressTo** | **String** | The address receiving an action |  [optional] |
| **ani** | **String** | Automatic Number Identification (caller's number) |  [optional] |
| **dnis** | **String** | Dialed number identification service (number dialed by the calling party) |  [optional] |
| **teamId** | **String** | The team Id the user is a member of |  [optional] |
| **scoredAgents** | [**List&lt;V2QueueObservationScoredAgent&gt;**](V2QueueObservationScoredAgent) | Scored agents for this conversation |  [optional] |
| **requestedRoutings** | [**List<RequestedRoutingsEnum>**](#Enum--RequestedRoutingsEnum) | All routing types for requested/attempted routing methods. |  [optional] |
| **usedRouting** | [**UsedRoutingEnum**](#Enum--UsedRoutingEnum) | Complete routing method |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:229.0.0_
