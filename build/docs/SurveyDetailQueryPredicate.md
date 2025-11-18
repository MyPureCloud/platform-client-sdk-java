# SurveyDetailQueryPredicate


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
| EVENTTIME | &quot;eventTime&quot; | 
| QUEUEID | &quot;queueId&quot; | 
| SURVEYCOMPLETEDDATE | &quot;surveyCompletedDate&quot; | 
| SURVEYFORMCONTEXTID | &quot;surveyFormContextId&quot; | 
| SURVEYFORMID | &quot;surveyFormId&quot; | 
| SURVEYID | &quot;surveyId&quot; | 
| SURVEYPARTIALRESPONSE | &quot;surveyPartialResponse&quot; | 
| SURVEYPROMOTERSCORE | &quot;surveyPromoterScore&quot; | 
| SURVEYSTATUS | &quot;surveyStatus&quot; | 
| SURVEYTYPE | &quot;surveyType&quot; | 
| USERID | &quot;userId&quot; | 


## Enum: MetricEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OSURVEYTOTALSCORE | &quot;oSurveyTotalScore&quot; | 


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MATCHES | &quot;matches&quot; | 
| EXISTS | &quot;exists&quot; | 
| NOTEXISTS | &quot;notExists&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:237.0.0_
