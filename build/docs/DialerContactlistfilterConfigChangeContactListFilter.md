---
title: DialerContactlistfilterConfigChangeContactListFilter
---
## DialerContactlistfilterConfigChangeContactListFilter


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **name** | **String** |  |  [optional] |
| **dateCreated** | [**Date**](Date.html) |  |  [optional] |
| **dateModified** | [**Date**](Date.html) |  |  [optional] |
| **version** | **Integer** |  |  [optional] |
| **contactList** | [**DialerContactlistfilterConfigChangeUriReference**](DialerContactlistfilterConfigChangeUriReference.html) |  |  [optional] |
| **contactListColumns** | **List&lt;String&gt;** |  |  [optional] |
| **clauses** | [**List&lt;DialerContactlistfilterConfigChangeFilterClause&gt;**](DialerContactlistfilterConfigChangeFilterClause.html) |  |  [optional] |
| **filterType** | [**FilterTypeEnum**](#FilterTypeEnum) |  |  [optional] |
| **additionalProperties** | **Object** |  |  [optional] |
{: class="table table-striped"}


<a name="FilterTypeEnum"></a>

## Enum: FilterTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| AND | &quot;AND&quot; |
| OR | &quot;OR&quot; |
{: class="table table-striped"}



