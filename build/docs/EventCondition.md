---
title: EventCondition
---
## EventCondition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **key** | <!----><!---->**String**<!----> | The event key. |  |
| **values** | <!----><!---->**List&lt;String&gt;**<!----> | The event values. |  |
| **operator** | [**OperatorEnum**](#OperatorEnum)<!----> | The comparison operator. |  [optional] |
| **streamType** | [**StreamTypeEnum**](#StreamTypeEnum)<!----> | The stream type for which this condition can be satisfied. |  |
| **sessionType** | <!----><!---->**String**<!----> | The session type for which this condition can be satisfied. |  |
| **eventName** | <!----><!---->**String**<!----> | The name of the event for which this condition can be satisfied. |  [optional] |
{: class="table table-striped"}


<a name="OperatorEnum"></a>

## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CONTAINSALL | &quot;containsAll&quot; | 
| CONTAINSANY | &quot;containsAny&quot; | 
| NOTCONTAINSALL | &quot;notContainsAll&quot; | 
| NOTCONTAINSANY | &quot;notContainsAny&quot; | 
| EQUAL | &quot;equal&quot; | 
| NOTEQUAL | &quot;notEqual&quot; | 
| GREATERTHAN | &quot;greaterThan&quot; | 
| GREATERTHANOREQUAL | &quot;greaterThanOrEqual&quot; | 
| LESSTHAN | &quot;lessThan&quot; | 
| LESSTHANOREQUAL | &quot;lessThanOrEqual&quot; | 
| STARTSWITH | &quot;startsWith&quot; | 
| ENDSWITH | &quot;endsWith&quot; | 
{: class="table table-striped"}


<a name="StreamTypeEnum"></a>

## Enum: StreamTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| WEB | &quot;Web&quot; | 
| CUSTOM | &quot;Custom&quot; | 
| CONVERSATION | &quot;Conversation&quot; | 
{: class="table table-striped"}



