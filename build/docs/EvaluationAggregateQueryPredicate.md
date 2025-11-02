# EvaluationAggregateQueryPredicate


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
| ASSIGNEEAPPLICABLE | &quot;assigneeApplicable&quot; | 
| ASSIGNEEID | &quot;assigneeId&quot; | 
| CALIBRATIONID | &quot;calibrationId&quot; | 
| CONTEXTID | &quot;contextId&quot; | 
| CONVERSATIONID | &quot;conversationId&quot; | 
| CONVERSATIONSTART | &quot;conversationStart&quot; | 
| DIVISIONID | &quot;divisionId&quot; | 
| EVALUATIONCONTEXTID | &quot;evaluationContextId&quot; | 
| EVALUATIONCREATEDDATE | &quot;evaluationCreatedDate&quot; | 
| EVALUATIONID | &quot;evaluationId&quot; | 
| EVALUATIONRELEASEDATE | &quot;evaluationReleaseDate&quot; | 
| EVALUATORID | &quot;evaluatorId&quot; | 
| FORMID | &quot;formId&quot; | 
| MEDIATYPE | &quot;mediaType&quot; | 
| QUEUEID | &quot;queueId&quot; | 
| RELEASED | &quot;released&quot; | 
| RESCORED | &quot;rescored&quot; | 
| SYSTEMSUBMITTED | &quot;systemSubmitted&quot; | 
| TEAMID | &quot;teamId&quot; | 
| USERID | &quot;userId&quot; | 


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MATCHES | &quot;matches&quot; | 
| EXISTS | &quot;exists&quot; | 
| NOTEXISTS | &quot;notExists&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:236.0.0_
