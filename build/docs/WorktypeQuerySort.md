---
title: WorktypeQuerySort
---
## WorktypeQuerySort


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | [**NameEnum**](#NameEnum)<!----> | Specify an attribute for sorting. It's possible to use an attribute both for sorting and in the query at the same time, but these restrictions apply: Only the operators EQ, LT, LTE, GT, GTE, BETWEEN and BEGINS_WITH are supported and the attribute can't be present in more than one filter. |  [optional] |
| **ascending** | <!----><!---->**Boolean**<!----> | Sort Ascending |  [optional] |
{: class="table table-striped"}


<a name="NameEnum"></a>

## Enum: NameEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DATEMODIFIED | &quot;dateModified&quot; | 
| NAME | &quot;name&quot; | 
{: class="table table-striped"}



