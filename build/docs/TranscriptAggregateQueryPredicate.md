---
title: TranscriptAggregateQueryPredicate
---
## TranscriptAggregateQueryPredicate


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
| ADDRESSFROM | &quot;addressFrom&quot; | 
| ADDRESSTO | &quot;addressTo&quot; | 
| ANI | &quot;ani&quot; | 
| CHANNEL | &quot;channel&quot; | 
| CONVERSATIONID | &quot;conversationId&quot; | 
| DIRECTION | &quot;direction&quot; | 
| DIVISIONID | &quot;divisionId&quot; | 
| DNIS | &quot;dnis&quot; | 
| FLOWID | &quot;flowId&quot; | 
| FLOWVERSION | &quot;flowVersion&quot; | 
| MEDIATYPE | &quot;mediaType&quot; | 
| MESSAGETYPE | &quot;messageType&quot; | 
| QUEUEID | &quot;queueId&quot; | 
| RESULTSBY | &quot;resultsBy&quot; | 
| TEAMID | &quot;teamId&quot; | 
| TOPICID | &quot;topicId&quot; | 
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



