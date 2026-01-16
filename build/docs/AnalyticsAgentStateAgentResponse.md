# AnalyticsAgentStateAgentResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **userId** | **String** | User Id - only returned if division is covered by agentStateNames permission |  [optional] |
| **divisionId** | **String** | Division Id |  [optional] |
| **userName** | **String** | User name - only returned if division is covered by agentStateNames permission |  [optional] |
| **managerId** | **String** | The user that this user reports to |  [optional] |
| **sessionCount** | **Integer** | The count of sessions |  [optional] |
| **sessions** | [**List&lt;AnalyticsAgentStateAgentSessionResult&gt;**](AnalyticsAgentStateAgentSessionResult) | List of sessions |  [optional] |
| **systemPresence** | [**SystemPresenceEnum**](#Enum--SystemPresenceEnum) | The user's system presence |  [optional] |
| **organizationPresenceId** | **String** | The identifier for the user's organization presence |  [optional] |
| **presenceDate** | [**Date**](Date) | The timestamp for when the user's presence began. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **routingStatus** | [**RoutingStatusEnum**](#Enum--RoutingStatusEnum) | The user's routing status |  [optional] |
| **routingStatusDate** | [**Date**](Date) | The timestamp for when the user's routing status began. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **isOutOfOffice** | **Boolean** | Whether the user is out of office |  [optional] |


## Enum: SystemPresenceEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 
| AVAILABLE | &quot;AVAILABLE&quot; | 
| AWAY | &quot;AWAY&quot; | 
| BUSY | &quot;BUSY&quot; | 
| OFFLINE | &quot;OFFLINE&quot; | 
| IDLE | &quot;IDLE&quot; | 
| ON_QUEUE | &quot;ON_QUEUE&quot; | 
| MEAL | &quot;MEAL&quot; | 
| TRAINING | &quot;TRAINING&quot; | 
| MEETING | &quot;MEETING&quot; | 
| BREAK | &quot;BREAK&quot; | 


## Enum: RoutingStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 
| OFF_QUEUE | &quot;OFF_QUEUE&quot; | 
| IDLE | &quot;IDLE&quot; | 
| INTERACTING | &quot;INTERACTING&quot; | 
| NOT_RESPONDING | &quot;NOT_RESPONDING&quot; | 
| COMMUNICATING | &quot;COMMUNICATING&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:244.0.0_
