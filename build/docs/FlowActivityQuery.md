---
title: FlowActivityQuery
---
## FlowActivityQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **metrics** | <!----><!---->[**List&lt;FlowActivityQueryMetric&gt;**](FlowActivityQueryMetric.html)<!----> | List of requested metrics |  |
| **groupBy** | <!---->[**List&lt;GroupByEnum&gt;**](#GroupByEnum)<!----> | Dimension(s) to group by |  |
| **filter** | <!----><!---->[**FlowActivityQueryFilter**](FlowActivityQueryFilter.html)<!----> | Filter to return a subset of observations. Expresses boolean logical predicates as well as dimensional filters |  [optional] |
| **order** | [**OrderEnum**](#OrderEnum)<!----> | Sort the result set in ascending/descending order. Default is ascending |  [optional] |
{: class="table table-striped"}


<a name="GroupByEnum"></a>

## Enum: GroupByEnum

| Name | Value |
| ---- | ----- |
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
| FLOWID | &quot;flowId&quot; |
| FLOWTYPE | &quot;flowType&quot; |
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
{: class="table table-striped"}


<a name="OrderEnum"></a>

## Enum: OrderEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ASC | &quot;asc&quot; | 
| DESC | &quot;desc&quot; | 
| UNORDERED | &quot;unordered&quot; | 
{: class="table table-striped"}



