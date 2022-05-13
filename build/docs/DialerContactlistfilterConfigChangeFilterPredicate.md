---
title: DialerContactlistfilterConfigChangeFilterPredicate
---
## DialerContactlistfilterConfigChangeFilterPredicate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **column** | <!----><!---->**String**<!----> | The contact list column |  [optional] |
| **columnType** | [**ColumnTypeEnum**](#ColumnTypeEnum)<!----> | Whether a contact column is numeric or alphabetic |  [optional] |
| **operator** | [**OperatorEnum**](#OperatorEnum)<!----> | The comparison operator |  [optional] |
| **value** | <!----><!---->**String**<!----> | The value the predicate applies to |  [optional] |
| **range** | <!----><!---->[**DialerContactlistfilterConfigChangeRange**](DialerContactlistfilterConfigChangeRange.html)<!----> |  |  [optional] |
| **inverted** | <!----><!---->**Boolean**<!----> | Whether or not to invert to result of evaluating the predicate |  [optional] |
{: class="table table-striped"}


<a name="ColumnTypeEnum"></a>

## Enum: ColumnTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NUMERIC | &quot;numeric&quot; | 
| ALPHABETIC | &quot;alphabetic&quot; | 
{: class="table table-striped"}


<a name="OperatorEnum"></a>

## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EQUALS | &quot;EQUALS&quot; | 
| LESS_THAN | &quot;LESS_THAN&quot; | 
| LESS_THAN_EQUALS | &quot;LESS_THAN_EQUALS&quot; | 
| GREATER_THAN | &quot;GREATER_THAN&quot; | 
| GREATER_THAN_EQUALS | &quot;GREATER_THAN_EQUALS&quot; | 
| CONTAINS | &quot;CONTAINS&quot; | 
| BEGINS_WITH | &quot;BEGINS_WITH&quot; | 
| ENDS_WITH | &quot;ENDS_WITH&quot; | 
| BEFORE | &quot;BEFORE&quot; | 
| AFTER | &quot;AFTER&quot; | 
| BETWEEN | &quot;BETWEEN&quot; | 
| IN | &quot;IN&quot; | 
{: class="table table-striped"}



