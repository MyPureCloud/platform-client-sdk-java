---
title: ContentFilterItem
---
## ContentFilterItem


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> |  |  [optional] |
| **operator** | [**OperatorEnum**](#OperatorEnum)<!----> |  |  [optional] |
| **values** | <!----><!---->**List&lt;String&gt;**<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NUMBER | &quot;NUMBER&quot; | 
| STRING | &quot;STRING&quot; | 
| DATE | &quot;DATE&quot; | 
| BOOLEAN | &quot;BOOLEAN&quot; | 
| LIST | &quot;LIST&quot; | 
{: class="table table-striped"}


<a name="OperatorEnum"></a>

## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| IN | &quot;IN&quot; | 
| RANGE | &quot;RANGE&quot; | 
| EQUALS | &quot;EQUALS&quot; | 
| NOTEQUALS | &quot;NOTEQUALS&quot; | 
| LESSTHAN | &quot;LESSTHAN&quot; | 
| LESSTHANEQUALS | &quot;LESSTHANEQUALS&quot; | 
| GREATERTHAN | &quot;GREATERTHAN&quot; | 
| GREATERTHANEQUALS | &quot;GREATERTHANEQUALS&quot; | 
| CONTAINS | &quot;CONTAINS&quot; | 
{: class="table table-striped"}



