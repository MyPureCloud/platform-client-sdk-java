# ConversationActivityQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **metrics** | [**List&lt;ConversationActivityQueryMetric&gt;**](ConversationActivityQueryMetric) | List of requested metrics |  |
| **groupBy** | [**List<GroupByEnum>**](#Enum--GroupByEnum) | Dimension(s) to group by |  |
| **filter** | [**ConversationActivityQueryFilter**](ConversationActivityQueryFilter) | Filter to return a subset of observations. Expresses boolean logical predicates as well as dimensional filters |  [optional] |
| **order** | [**OrderEnum**](#Enum--OrderEnum) | Sort the result set in ascending/descending order. Default is ascending |  [optional] |


## Enum: GroupByEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ACTIVEROUTING | &quot;activeRouting&quot; |
| ADDRESSFROM | &quot;addressFrom&quot; |
| ADDRESSTO | &quot;addressTo&quot; |
| AGENTSCORE | &quot;agentScore&quot; |
| ANI | &quot;ani&quot; |
| CONVERSATIONID | &quot;conversationId&quot; |
| CONVERTEDFROM | &quot;convertedFrom&quot; |
| CONVERTEDTO | &quot;convertedTo&quot; |
| DIRECTION | &quot;direction&quot; |
| DNIS | &quot;dnis&quot; |
| MEDIATYPE | &quot;mediaType&quot; |
| PARTICIPANTNAME | &quot;participantName&quot; |
| QUEUEID | &quot;queueId&quot; |
| REQUESTEDLANGUAGEID | &quot;requestedLanguageId&quot; |
| REQUESTEDROUTING | &quot;requestedRouting&quot; |
| REQUESTEDROUTINGSKILLID | &quot;requestedRoutingSkillId&quot; |
| ROUTINGPRIORITY | &quot;routingPriority&quot; |
| SCOREDAGENTID | &quot;scoredAgentId&quot; |
| SESSIONID | &quot;sessionId&quot; |
| TEAMID | &quot;teamId&quot; |
| USEDROUTING | &quot;usedRouting&quot; |
| USERID | &quot;userId&quot; |


## Enum: OrderEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ASC | &quot;asc&quot; | 
| DESC | &quot;desc&quot; | 
| UNORDERED | &quot;unordered&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:240.0.0_
