---
title: MatchCriteria
---
## MatchCriteria


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **jsonPath** | <!----><!---->**String**<!----> | The Goessner json path of the field to match |  [optional] |
| **operator** | [**OperatorEnum**](#OperatorEnum)<!----> | The type of operation to perform for matching check |  [optional] |
| **value** | <!----><!---->[**JsonNode**](JsonNode.html)<!----> | The value to match on. Only one of value and values can be included |  [optional] |
| **values** | <!----><!---->[**List&lt;JsonNode&gt;**](JsonNode.html)<!----> | The list of values to match on. Only one of value and values can be included |  [optional] |
{: class="table table-striped"}


<a name="OperatorEnum"></a>

## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| GREATERTHANOREQUAL | &quot;GreaterThanOrEqual&quot; | 
| LESSTHANOREQUAL | &quot;LessThanOrEqual&quot; | 
| EQUAL | &quot;Equal&quot; | 
| NOTEQUAL | &quot;NotEqual&quot; | 
| LESSTHAN | &quot;LessThan&quot; | 
| GREATERTHAN | &quot;GreaterThan&quot; | 
| NOTIN | &quot;NotIn&quot; | 
| IN | &quot;In&quot; | 
| CONTAINS | &quot;Contains&quot; | 
| ALL | &quot;All&quot; | 
| EXISTS | &quot;Exists&quot; | 
| SIZE | &quot;Size&quot; | 
{: class="table table-striped"}



