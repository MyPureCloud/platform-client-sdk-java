# BotAggregateQueryPredicate


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
| ASKACTIONID | &quot;askActionId&quot; | 
| ASKACTIONRESULT | &quot;askActionResult&quot; | 
| ASKACTIONTYPE | &quot;askActionType&quot; | 
| BOTFINALINTENT | &quot;botFinalIntent&quot; | 
| BOTFLOWSUBTYPE | &quot;botFlowSubType&quot; | 
| BOTFLOWTYPE | &quot;botFlowType&quot; | 
| BOTID | &quot;botId&quot; | 
| BOTINTENT | &quot;botIntent&quot; | 
| BOTNAME | &quot;botName&quot; | 
| BOTPRODUCT | &quot;botProduct&quot; | 
| BOTPROVIDER | &quot;botProvider&quot; | 
| BOTRECOGNITIONFAILUREREASON | &quot;botRecognitionFailureReason&quot; | 
| BOTRESULT | &quot;botResult&quot; | 
| BOTSESSIONID | &quot;botSessionId&quot; | 
| BOTSLOT | &quot;botSlot&quot; | 
| BOTSLOTMECHANISM | &quot;botSlotMechanism&quot; | 
| BOTVERSION | &quot;botVersion&quot; | 
| CONVERSATIONID | &quot;conversationId&quot; | 
| EXTERNALCONTACTID | &quot;externalContactId&quot; | 
| INTERMEDIATEINTENTNAME | &quot;intermediateIntentName&quot; | 
| KNOWLEDGEBASEID | &quot;knowledgeBaseId&quot; | 
| LANGUAGECODE | &quot;languageCode&quot; | 
| LASTACTIONID | &quot;lastActionId&quot; | 
| LASTINPUTACTIONID | &quot;lastInputActionId&quot; | 
| MEDIATYPE | &quot;mediaType&quot; | 
| MESSAGETYPE | &quot;messageType&quot; | 
| PREVIEWMODE | &quot;previewMode&quot; | 
| SELFSERVED | &quot;selfServed&quot; | 


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MATCHES | &quot;matches&quot; | 
| EXISTS | &quot;exists&quot; | 
| NOTEXISTS | &quot;notExists&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:232.0.0_
