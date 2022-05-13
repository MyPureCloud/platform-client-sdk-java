---
title: ContactListFilterClause
---
## ContactListFilterClause


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **filterType** | [**FilterTypeEnum**](#FilterTypeEnum)<!----> | How to join predicates together. |  [optional] |
| **predicates** | <!----><!---->[**List&lt;ContactListFilterPredicate&gt;**](ContactListFilterPredicate.html)<!----> | Conditions to filter the contacts by. |  [optional] |
{: class="table table-striped"}


<a name="FilterTypeEnum"></a>

## Enum: FilterTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AND | &quot;AND&quot; | 
| OR | &quot;OR&quot; | 
{: class="table table-striped"}



