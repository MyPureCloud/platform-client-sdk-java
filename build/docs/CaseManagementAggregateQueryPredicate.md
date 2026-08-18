# CaseManagementAggregateQueryPredicate


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
| ASSOCIATIONTYPE | &quot;associationType&quot; | 
| CASEID | &quot;caseId&quot; | 
| CASEPLANID | &quot;caseplanId&quot; | 
| CONVERSATIONID | &quot;conversationId&quot; | 
| CUSTOMERINTENTID | &quot;customerIntentId&quot; | 
| DIVISIONID | &quot;divisionId&quot; | 
| OWNERID | &quot;ownerId&quot; | 
| PRIORITY | &quot;priority&quot; | 
| STAGEID | &quot;stageId&quot; | 
| STATUS | &quot;status&quot; | 
| STEPID | &quot;stepId&quot; | 
| WORKITEMID | &quot;workitemId&quot; | 


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MATCHES | &quot;matches&quot; | 
| EXISTS | &quot;exists&quot; | 
| NOTEXISTS | &quot;notExists&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:260.0.0_
