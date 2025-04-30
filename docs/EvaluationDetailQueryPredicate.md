# EvaluationDetailQueryPredicate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Optional type, can usually be inferred |  [optional] |
| **dimension** | [**DimensionEnum**](#Enum--DimensionEnum) | Left hand side for dimension predicates |  [optional] |
| **metric** | [**MetricEnum**](#Enum--MetricEnum) | Left hand side for metric predicates |  [optional] |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | Optional operator, default is matches |  [optional] |
| **value** | **String** | Right hand side for dimension or metric predicates |  [optional] |
| **range** | [**NumericRange**](NumericRange) | Right hand side for dimension or metric predicates |  [optional] |


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
| DELETED | &quot;deleted&quot; | 
| EVALUATIONID | &quot;evaluationId&quot; | 
| EVALUATIONSTATUS | &quot;evaluationStatus&quot; | 
| EVALUATORID | &quot;evaluatorId&quot; | 
| EVENTTIME | &quot;eventTime&quot; | 
| FORMID | &quot;formId&quot; | 
| FORMNAME | &quot;formName&quot; | 
| QUEUEID | &quot;queueId&quot; | 
| RELEASED | &quot;released&quot; | 
| RESCORED | &quot;rescored&quot; | 
| USERID | &quot;userId&quot; | 


## Enum: MetricEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OTOTALCRITICALSCORE | &quot;oTotalCriticalScore&quot; | 
| OTOTALSCORE | &quot;oTotalScore&quot; | 


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MATCHES | &quot;matches&quot; | 
| EXISTS | &quot;exists&quot; | 
| NOTEXISTS | &quot;notExists&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:224.0.0_
