---
title: ConditionalGroupRoutingCondition
---
## ConditionalGroupRoutingCondition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queue** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | The queue being evaluated for this rule.  If null, the current queue will be used. |  [optional] |
| **metric** | [**MetricEnum**](#MetricEnum)<!----> | The queue metric being evaluated |  [optional] |
| **operator** | [**OperatorEnum**](#OperatorEnum)<!----> | The operator that compares the actual value against the condition value |  [optional] |
| **value** | <!----><!---->**Double**<!----> | The limit value, beyond which a rule evaluates as true |  [optional] |
{: class="table table-striped"}


<a name="MetricEnum"></a>

## Enum: MetricEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ESTIMATEDWAITTIME | &quot;EstimatedWaitTime&quot; | 
| SERVICELEVEL | &quot;ServiceLevel&quot; | 
{: class="table table-striped"}


<a name="OperatorEnum"></a>

## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| GREATERTHAN | &quot;GreaterThan&quot; | 
| GREATERTHANOREQUALTO | &quot;GreaterThanOrEqualTo&quot; | 
| LESSTHAN | &quot;LessThan&quot; | 
| LESSTHANOREQUALTO | &quot;LessThanOrEqualTo&quot; | 
{: class="table table-striped"}



