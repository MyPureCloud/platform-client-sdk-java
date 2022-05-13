---
title: EvaluationDetailQueryPredicate
---
## EvaluationDetailQueryPredicate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Optional type, can usually be inferred |  [optional] |
| **dimension** | [**DimensionEnum**](#DimensionEnum)<!----> | Left hand side for dimension predicates |  [optional] |
| **metric** | [**MetricEnum**](#MetricEnum)<!----> | Left hand side for metric predicates |  [optional] |
| **operator** | [**OperatorEnum**](#OperatorEnum)<!----> | Optional operator, default is matches |  [optional] |
| **value** | <!----><!---->**String**<!----> | Right hand side for dimension or metric predicates |  [optional] |
| **range** | <!----><!---->[**NumericRange**](NumericRange.html)<!----> | Right hand side for dimension or metric predicates |  [optional] |
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
| DELETED | &quot;deleted&quot; | 
| EVALUATIONID | &quot;evaluationId&quot; | 
| EVALUATORID | &quot;evaluatorId&quot; | 
| EVENTTIME | &quot;eventTime&quot; | 
| FORMID | &quot;formId&quot; | 
| FORMNAME | &quot;formName&quot; | 
| QUEUEID | &quot;queueId&quot; | 
| RELEASED | &quot;released&quot; | 
| RESCORED | &quot;rescored&quot; | 
| USERID | &quot;userId&quot; | 
{: class="table table-striped"}


<a name="MetricEnum"></a>

## Enum: MetricEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OTOTALCRITICALSCORE | &quot;oTotalCriticalScore&quot; | 
| OTOTALSCORE | &quot;oTotalScore&quot; | 
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



