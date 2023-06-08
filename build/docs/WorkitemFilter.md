---
title: WorkitemFilter
---
## WorkitemFilter


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | <!----><!---->**String**<!----> | Attribute name. |  |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Attribute type. |  |
| **operator** | [**OperatorEnum**](#OperatorEnum)<!----> | Filter operator. |  |
| **values** | <!----><!---->**List&lt;String&gt;**<!----> | List of values to be used in the filter. |  |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| STRING | &quot;String&quot; | 
| INT | &quot;Int&quot; | 
{: class="table table-striped"}


<a name="OperatorEnum"></a>

## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EQ | &quot;EQ&quot; | 
| NEQ | &quot;NEQ&quot; | 
| GT | &quot;GT&quot; | 
| LT | &quot;LT&quot; | 
| GTE | &quot;GTE&quot; | 
| LTE | &quot;LTE&quot; | 
| IN | &quot;IN&quot; | 
| CONTAINS | &quot;CONTAINS&quot; | 
| BETWEEN | &quot;BETWEEN&quot; | 
| BEGINS_WITH | &quot;BEGINS_WITH&quot; | 
{: class="table table-striped"}



