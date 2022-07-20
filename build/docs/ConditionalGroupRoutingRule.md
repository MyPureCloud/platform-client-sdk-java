---
title: ConditionalGroupRoutingRule
---
## ConditionalGroupRoutingRule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queue** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | The queue being evaluated for this rule.  For rule 1, this is always the current queue, so should not be specified. |  [optional] |
| **metric** | [**MetricEnum**](#MetricEnum)<!----> | The queue metric being evaluated |  [optional] |
| **operator** | [**OperatorEnum**](#OperatorEnum)<!----> | The operator that compares the actual value against the condition value |  [optional] |
| **conditionValue** | <!----><!---->**Double**<!----> | The limit value, beyond which a rule evaluates as true |  [optional] |
| **groups** | <!----><!---->[**List&lt;MemberGroup&gt;**](MemberGroup.html)<!----> | The group(s) to activate if the rule evaluates as true |  [optional] |
| **waitSeconds** | <!----><!---->**Integer**<!----> | The number of seconds to wait in this rule, if it evaluates as true, before evaluating the next rule.  For the final rule, this is ignored, so need not be specified. |  [optional] |
{: class="table table-striped"}


<a name="MetricEnum"></a>

## Enum: MetricEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ESTIMATEDWAITTIME | &quot;EstimatedWaitTime&quot; | 
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



