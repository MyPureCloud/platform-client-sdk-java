---
title: ConversationActivityQueryPredicate
---
## ConversationActivityQueryPredicate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Optional type, can usually be inferred |  [optional] |
| **dimension** | [**DimensionEnum**](#DimensionEnum)<!----> | Left hand side for dimension predicates |  [optional] |
| **operator** | [**OperatorEnum**](#OperatorEnum)<!----> | Optional operator, default is matches |  [optional] |
| **value** | <!----><!---->**String**<!----> | Right hand side for dimension predicates |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DIMENSION | &quot;dimension&quot; | 
| PROPERTY | &quot;property&quot; | 
| METRIC | &quot;metric&quot; | 
{: class="table table-striped"}


<a name="DimensionEnum"></a>

## Enum: DimensionEnum

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
{: class="table table-striped"}


<a name="OperatorEnum"></a>

## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MATCHES | &quot;matches&quot; | 
| EXISTS | &quot;exists&quot; | 
| NOTEXISTS | &quot;notExists&quot; | 
{: class="table table-striped"}



