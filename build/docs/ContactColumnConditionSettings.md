---
title: ContactColumnConditionSettings
---
## ContactColumnConditionSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **columnName** | <!----><!---->**String**<!----> | The name of the contact list column to evaluate. |  |
| **operator** | [**OperatorEnum**](#OperatorEnum)<!----> | The operator to use when comparing values. |  |
| **value** | <!----><!---->**String**<!----> | The value to compare against the contact's data. |  |
| **valueType** | [**ValueTypeEnum**](#ValueTypeEnum)<!----> | The data type the value should be treated as. |  |
{: class="table table-striped"}


<a name="OperatorEnum"></a>

## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EQUALS | &quot;Equals&quot; | 
| LESSTHAN | &quot;LessThan&quot; | 
| LESSTHANEQUALS | &quot;LessThanEquals&quot; | 
| GREATERTHAN | &quot;GreaterThan&quot; | 
| GREATERTHANEQUALS | &quot;GreaterThanEquals&quot; | 
| CONTAINS | &quot;Contains&quot; | 
| BEGINSWITH | &quot;BeginsWith&quot; | 
| ENDSWITH | &quot;EndsWith&quot; | 
| BEFORE | &quot;Before&quot; | 
| AFTER | &quot;After&quot; | 
{: class="table table-striped"}


<a name="ValueTypeEnum"></a>

## Enum: ValueTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DATETIME | &quot;DateTime&quot; | 
| NUMERIC | &quot;Numeric&quot; | 
| PERIOD | &quot;Period&quot; | 
| STRING | &quot;String&quot; | 
{: class="table table-striped"}



