# SummaryAggregateQueryPredicate


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
| CONVERSATIONID | &quot;conversationId&quot; | 
| COPIED | &quot;copied&quot; | 
| EDITEDFIELD | &quot;editedField&quot; | 
| ERRORTYPE | &quot;errorType&quot; | 
| LANGUAGE | &quot;language&quot; | 
| MEDIATYPE | &quot;mediaType&quot; | 
| MESSAGETYPE | &quot;messageType&quot; | 
| PRESENTED | &quot;presented&quot; | 
| QUEUEID | &quot;queueId&quot; | 
| SUMMARYGENERATED | &quot;summaryGenerated&quot; | 
| SUMMARYID | &quot;summaryId&quot; | 
| SUMMARYRATING | &quot;summaryRating&quot; | 
| TRIGGERSOURCEID | &quot;triggerSourceId&quot; | 
| TRIGGERSOURCEOUTCOME | &quot;triggerSourceOutcome&quot; | 
| TRIGGERSOURCETYPE | &quot;triggerSourceType&quot; | 
| USERID | &quot;userId&quot; | 
| WRAPUPCODERATING | &quot;wrapUpCodeRating&quot; | 
| WRAPUPCODESUGGESTIONSELECTED | &quot;wrapUpCodeSuggestionSelected&quot; | 
| WRAPUPCODESGENERATED | &quot;wrapupCodesGenerated&quot; | 


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MATCHES | &quot;matches&quot; | 
| EXISTS | &quot;exists&quot; | 
| NOTEXISTS | &quot;notExists&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:240.0.0_
