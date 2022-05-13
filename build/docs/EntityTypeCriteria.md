---
title: EntityTypeCriteria
---
## EntityTypeCriteria


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **key** | <!----><!---->**String**<!----> | The criteria key. |  |
| **values** | <!----><!---->**List&lt;String&gt;**<!----> | The criteria values. |  |
| **shouldIgnoreCase** | <!----><!---->**Boolean**<!----> | Should criteria be case insensitive. |  |
| **operator** | [**OperatorEnum**](#OperatorEnum)<!----> | The comparison operator. |  [optional] |
| **entityType** | [**EntityTypeEnum**](#EntityTypeEnum)<!----> | The entity to match the pattern against. |  [optional] |
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


<a name="EntityTypeEnum"></a>

## Enum: EntityTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| VISIT | &quot;visit&quot; | 
{: class="table table-striped"}



