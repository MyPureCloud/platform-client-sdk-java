---
title: HistoryEntry
---
## HistoryEntry


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **action** | [**ActionEnum**](#ActionEnum)<!----> | The action performed |  [optional] |
| **resource** | <!----><!---->**String**<!----> | For actions performed not on the item itself, but on a sub-item, this field identifies the sub-item by name.  For example, for actions performed on prompt resources, this will be the prompt resource name. |  [optional] |
| **timestamp** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **user** | <!----><!---->[**User**](User.html)<!----> | User associated with this entry. |  [optional] |
| **client** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | OAuth client associated with this entry. |  [optional] |
| **version** | <!----><!---->**String**<!----> |  |  [optional] |
| **secure** | <!----><!---->**Boolean**<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="ActionEnum"></a>

## Enum: ActionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CHECKIN | &quot;CHECKIN&quot; | 
| CHECKOUT | &quot;CHECKOUT&quot; | 
| CREATE | &quot;CREATE&quot; | 
| DEACTIVATE | &quot;DEACTIVATE&quot; | 
| DEBUG | &quot;DEBUG&quot; | 
| DELETE | &quot;DELETE&quot; | 
| PUBLISH | &quot;PUBLISH&quot; | 
| REVERT | &quot;REVERT&quot; | 
| SAVE | &quot;SAVE&quot; | 
| TRANSCODE | &quot;TRANSCODE&quot; | 
| UPDATE | &quot;UPDATE&quot; | 
| UPLOAD | &quot;UPLOAD&quot; | 
{: class="table table-striped"}



