---
title: ContactBulkSearchCriteria
---
## ContactBulkSearchCriteria


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **clauses** | <!----><!---->[**List&lt;ContactListFilterClause&gt;**](ContactListFilterClause.html)<!----> | Groups of conditions to filter the contacts by. |  [optional] |
| **filterType** | [**FilterTypeEnum**](#FilterTypeEnum)<!----> | How to join clauses together. |  [optional] |
{: class="table table-striped"}


<a name="FilterTypeEnum"></a>

## Enum: FilterTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AND | &quot;AND&quot; | 
| OR | &quot;OR&quot; | 
{: class="table table-striped"}



