---
title: EvaluationAggregateQueryPredicate
---
## EvaluationAggregateQueryPredicate


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
| CALIBRATIONID | &quot;calibrationId&quot; | 
| CONTEXTID | &quot;contextId&quot; | 
| CONVERSATIONID | &quot;conversationId&quot; | 
| CONVERSATIONSTART | &quot;conversationStart&quot; | 
| DIVISIONID | &quot;divisionId&quot; | 
| EVALUATIONCREATEDDATE | &quot;evaluationCreatedDate&quot; | 
| EVALUATIONID | &quot;evaluationId&quot; | 
| EVALUATIONRELEASEDATE | &quot;evaluationReleaseDate&quot; | 
| EVALUATORID | &quot;evaluatorId&quot; | 
| FORMID | &quot;formId&quot; | 
| QUEUEID | &quot;queueId&quot; | 
| RELEASED | &quot;released&quot; | 
| RESCORED | &quot;rescored&quot; | 
| TEAMID | &quot;teamId&quot; | 
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



