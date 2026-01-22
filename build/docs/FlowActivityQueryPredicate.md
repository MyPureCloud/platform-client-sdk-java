# FlowActivityQueryPredicate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Optional type, can usually be inferred |  [optional] |
| **dimension** | [**DimensionEnum**](#Enum--DimensionEnum) | Left hand side for dimension predicates |  [optional] |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | Optional operator, default is matches |  [optional] |
| **value** | **String** | Right hand side for dimension predicates |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DIMENSION | &quot;dimension&quot; | 
| PROPERTY | &quot;property&quot; | 
| METRIC | &quot;metric&quot; | 


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


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MATCHES | &quot;matches&quot; | 
| EXISTS | &quot;exists&quot; | 
| NOTEXISTS | &quot;notExists&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:245.0.0_
