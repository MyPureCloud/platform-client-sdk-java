---
title: V2MobiusAlertsTopicCondition
---
## V2MobiusAlertsTopicCondition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **conditions** | <!----><!---->[**List&lt;V2MobiusAlertsTopicCondition&gt;**](V2MobiusAlertsTopicCondition.html)<!----> |  |  [optional] |
| **predicates** | <!----><!---->[**List&lt;V2MobiusAlertsTopicConditionRulePredicate&gt;**](V2MobiusAlertsTopicConditionRulePredicate.html)<!----> |  |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AND | &quot;And&quot; | 
| OR | &quot;Or&quot; | 
| NOT | &quot;Not&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}



