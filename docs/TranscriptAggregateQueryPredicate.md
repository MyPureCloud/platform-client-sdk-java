# TranscriptAggregateQueryPredicate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Optional type, can usually be inferred |  [optional] |
| **dimension** | [**DimensionEnum**](#Enum--DimensionEnum) | Left hand side for dimension predicates |  [optional] |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | Optional operator, default is matches |  [optional] |
| **value** | **String** | Right hand side for dimension predicates |  [optional] |
| **range** | [**NumericRange**](NumericRange) | Right hand side for dimension predicates |  [optional] |


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
| ADDRESSFROM | &quot;addressFrom&quot; | 
| ADDRESSTO | &quot;addressTo&quot; | 
| ANI | &quot;ani&quot; | 
| CATEGORYID | &quot;categoryId&quot; | 
| CHANNEL | &quot;channel&quot; | 
| CONVERSATIONDURATION | &quot;conversationDuration&quot; | 
| CONVERSATIONID | &quot;conversationId&quot; | 
| DIRECTION | &quot;direction&quot; | 
| DIVISIONID | &quot;divisionId&quot; | 
| DNIS | &quot;dnis&quot; | 
| FLOWID | &quot;flowId&quot; | 
| FLOWVERSION | &quot;flowVersion&quot; | 
| HANDLETIME | &quot;handleTime&quot; | 
| MEDIATYPE | &quot;mediaType&quot; | 
| MESSAGETYPE | &quot;messageType&quot; | 
| QUEUEID | &quot;queueId&quot; | 
| RESULTSBY | &quot;resultsBy&quot; | 
| TEAMID | &quot;teamId&quot; | 
| TOPICID | &quot;topicId&quot; | 
| USERID | &quot;userId&quot; | 
| WRAPUPCODE | &quot;wrapUpCode&quot; | 


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MATCHES | &quot;matches&quot; | 
| EXISTS | &quot;exists&quot; | 
| NOTEXISTS | &quot;notExists&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:226.0.0_
