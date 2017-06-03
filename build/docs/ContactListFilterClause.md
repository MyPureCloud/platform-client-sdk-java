---
title: ContactListFilterClause
---
## ContactListFilterClause


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **filterType** | [**FilterTypeEnum**](#FilterTypeEnum) | The filter type tells the api how to compare between predicates |  [optional] |
| **predicates** | [**List&lt;ContactListFilterPredicate&gt;**](ContactListFilterPredicate.html) |  |  [optional] |
{: class="table table-striped"}


<a name="FilterTypeEnum"></a>

## Enum: FilterTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| AND | &quot;AND&quot; |
| OR | &quot;OR&quot; |
{: class="table table-striped"}


