---
title: ContactListFilterNotificationPredicates
---
## ContactListFilterNotificationPredicates


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **column** | **String** |  |  [optional] |
| **columnType** | [**ColumnTypeEnum**](#ColumnTypeEnum) |  |  [optional] |
| **operator** | [**OperatorEnum**](#OperatorEnum) |  |  [optional] |
| **value** | **String** |  |  [optional] |
| **range** | [**ContactListFilterNotificationRange**](ContactListFilterNotificationRange.html) |  |  [optional] |
| **inverted** | **Boolean** |  |  [optional] |
| **additionalProperties** | **Object** |  |  [optional] |
{: class="table table-striped"}


<a name="ColumnTypeEnum"></a>

## Enum: ColumnTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| NUMERIC | &quot;NUMERIC&quot; |
| ALPHABETIC | &quot;ALPHABETIC&quot; |
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



