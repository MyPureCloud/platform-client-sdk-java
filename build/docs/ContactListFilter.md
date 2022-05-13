---
title: ContactListFilter
---
## ContactListFilter


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of the list. |  |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **version** | <!----><!---->**Integer**<!----> | Required for updates, must match the version number of the most recent update |  [optional] |
| **contactList** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | The contact list the filter is based on. |  |
| **clauses** | <!----><!---->[**List&lt;ContactListFilterClause&gt;**](ContactListFilterClause.html)<!----> | Groups of conditions to filter the contacts by. |  [optional] |
| **filterType** | [**FilterTypeEnum**](#FilterTypeEnum)<!----> | How to join clauses together. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="FilterTypeEnum"></a>

## Enum: FilterTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AND | &quot;AND&quot; | 
| OR | &quot;OR&quot; | 
{: class="table table-striped"}



