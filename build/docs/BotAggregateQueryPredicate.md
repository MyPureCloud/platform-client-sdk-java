---
title: BotAggregateQueryPredicate
---
## BotAggregateQueryPredicate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Optional type, can usually be inferred |  [optional] |
| **dimension** | [**DimensionEnum**](#DimensionEnum)<!----> | Left hand side for dimension predicates |  [optional] |
| **operator** | [**OperatorEnum**](#OperatorEnum)<!----> | Optional operator, default is matches |  [optional] |
| **value** | <!----><!---->**String**<!----> | Right hand side for dimension predicates |  [optional] |
| **range** | <!----><!---->[**NumericRange**](NumericRange.html)<!----> | Right hand side for dimension predicates |  [optional] |
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
| BOTFINALINTENT | &quot;botFinalIntent&quot; | 
| BOTID | &quot;botId&quot; | 
| BOTINTENT | &quot;botIntent&quot; | 
| BOTPRODUCT | &quot;botProduct&quot; | 
| BOTPROVIDER | &quot;botProvider&quot; | 
| BOTRECOGNITIONFAILUREREASON | &quot;botRecognitionFailureReason&quot; | 
| BOTRESULT | &quot;botResult&quot; | 
| BOTSESSIONID | &quot;botSessionId&quot; | 
| BOTSLOT | &quot;botSlot&quot; | 
| BOTVERSION | &quot;botVersion&quot; | 
| CONVERSATIONID | &quot;conversationId&quot; | 
| EXTERNALCONTACTID | &quot;externalContactId&quot; | 
| KNOWLEDGEBASEID | &quot;knowledgeBaseId&quot; | 
| LASTACTIONID | &quot;lastActionId&quot; | 
| LASTINPUTACTIONID | &quot;lastInputActionId&quot; | 
| MEDIATYPE | &quot;mediaType&quot; | 
| MESSAGETYPE | &quot;messageType&quot; | 
| SELFSERVED | &quot;selfServed&quot; | 
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



